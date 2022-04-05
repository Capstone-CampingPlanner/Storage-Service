package com.example.strg.controller;

import com.example.strg.data.*;
import com.example.strg.repository.*;
import com.example.strg.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PrivateKey;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    StorageService storageService;

    @Autowired
    private StorageRepository storageRepository;

    @Autowired
    private StorageManagerRepository storageManagerRepository;

    @Autowired
    private StorageBoxRepository storageBoxRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private OrderListRepository orderListRepository;

    @Autowired
    private UseStorageBoxRepository useStorageBoxRepository;

    @PostMapping("/postStorage")
    public Result postStorage(@RequestBody Storage storage) {
        Optional<Storage> findStrg = storageRepository.findByStorageName(storage.getStorageName());

        if (!findStrg.isPresent()) {
            storageRepository.save(storage);
            return new Result("ok");
        } else {
            return new Result("no");
        }

    }

    @PostMapping("/postBox")
    public Result postBox(@RequestBody Box box){
        Storage strg = storageService.findStorageName(box.getStorageName());

        String storageBoxName;
        String storageBoxType;
        String storageBoxState;

        for (int i = 0; i < box.getSmall(); i++) {
            storageBoxName = "S"+(i+1);
            storageBoxType = "0";
            storageBoxState = "0";
            StorageBox storageBoxSmall = new StorageBox(strg,storageBoxName,storageBoxType,storageBoxState);
            storageBoxRepository.save(storageBoxSmall);

            storageBoxName = "0";
            storageBoxType = "0";
            storageBoxState = "0";
        }
        for (int i = 0; i < box.getMedium(); i++) {
            storageBoxName = "M"+(i+1);
            storageBoxType = "0";
            storageBoxState = "0";
            StorageBox storageBoxSmall = new StorageBox(strg,storageBoxName,storageBoxType,storageBoxState);
            storageBoxRepository.save(storageBoxSmall);

            storageBoxName = "0";
            storageBoxType = "0";
            storageBoxState = "0";
        }
        for (int i = 0; i < box.getLarge(); i++) {
            storageBoxName = "L"+(i+1);
            storageBoxType = "0";
            storageBoxState = "0";
            StorageBox storageBoxSmall = new StorageBox(strg,storageBoxName,storageBoxType,storageBoxState);
            storageBoxRepository.save(storageBoxSmall);

            storageBoxName = "0";
            storageBoxType = "0";
            storageBoxState = "0";
        }

        return new Result("ok");
    }

    @PostMapping("/postManager")
    public Result postManager(@RequestBody Manager manager) {
        Storage storage = storageService.findStorageCode(manager.getStorage());
        Member member =storageService.findMemberMemberId(manager.getMember());
        StorageManager storageManager = new StorageManager(member,storage);
        storageManagerRepository.save(storageManager);

        return new Result("ok");
    }

    @PostMapping("/payStorageBox")
    public Result payStorageBox(@RequestBody payStorageBox payStorageBox){
        Optional<Member> user = memberRepository.findByMemberId(payStorageBox.getUserId());
        Optional<StorageBox> storageBox = storageBoxRepository.findById(payStorageBox.getStorageBoxCode());
        System.out.println(user.get().getMemberName());
        System.out.println(storageBox.get().getStorageBoxName());

        OrderList orderList = new OrderList(user.get());
        orderListRepository.save(orderList);

        UseStorageBox useStorageBox = new UseStorageBox(storageBox.get(), orderList);
        useStorageBoxRepository.save(useStorageBox);
        return new Result("ok");

    }

    @GetMapping("/checkManager/{memberId}")
    public Result checkManager(@PathVariable String memberId) throws NoSuchElementException {
        try {
            Optional<Member> member = memberRepository.findByMemberId(memberId);
            System.out.println(member.get().getMemberId());
            Optional<StorageManager> storageManager = storageManagerRepository.findByMemberCode(member);

            if (storageManager.isPresent()) {
                // 중복
                return new Result("overlap");

            }else{
                // 가능
                return new Result("ok");
            }
        }catch (NoSuchElementException n){
            System.out.println(n);
            return new Result("no");
        }
    }

    @GetMapping("/getStorage")
    public List<Storage> getStorages() {
        List<Storage> storageList = storageRepository.findAll();
        return storageList;
    }

    @GetMapping("/storageView/{storageCode}")
    public List<StorageBox> getStorageDetail(@PathVariable(value = "storageCode") Long storageCode){
        Optional<Storage> storage = storageRepository.findById(storageCode);
        List<StorageBox> boxList = storageBoxRepository.findByStorageCode(storage.get());

        return boxList;
    }

    @GetMapping("/getStorageManger")
    public List<StorageManager> getStorageManger() {
        List<StorageManager> managerList = storageManagerRepository.findAll();

        return managerList;
    }

    @GetMapping("/getManager/{storageCode}")
    public List<StorageManager> getManager(@PathVariable(value = "storageCode") long storageCode){
        List<StorageManager> managerList = storageService.findByStorageCode(storageCode);
        return managerList;
    }


//    로그인 없이 사용자 지정 할 때 사용
    @GetMapping("memberCheck/{memberId}")
    public Result getMemberId(@PathVariable(value = "memberId")String memberId){
        Optional<Member> member = memberRepository.findByMemberId(memberId);

        if(member.isPresent()){
            return new Result("ok");
        }else{
            return new Result("no");
        }
    }
}
