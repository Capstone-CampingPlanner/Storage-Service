package com.example.strg.controller;

import com.example.strg.data.*;
import com.example.strg.repository.MemberRepository;
import com.example.strg.repository.StorageBoxRepository;
import com.example.strg.repository.StorageManagerRepository;
import com.example.strg.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private StorageRepository storageRepository;

    @Autowired
    private StorageManagerRepository storageManagerRepository;

    @Autowired
    private StorageBoxRepository storageBoxRepository;

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/postStorage")
    public Result postStorage(@RequestBody Storage storage) {

        Optional<Storage> findStrg = storageRepository.findByStorageName(storage.getStorageName());

        System.out.println(storage.getStorageName());

        if (!findStrg.isPresent()) {
            storageRepository.save(storage);
            return new Result("ok");
        } else {
            return new Result("no");
        }

    }

    @PostMapping("/postManager")
    public Result postManager(@RequestParam("memberId") String memberId, @RequestParam("storageName") String storageName) {

        Optional<Storage> storage = storageRepository.findByStorageName(storageName);
        Optional<Member> member = memberRepository.findByMemberId(memberId);

//        List<Storage> storageList = storageRepository.findAll();
//        List<Member> memberList = memberRepository.findAll();


        if (!storage.isPresent()) {
            return new Result("no");
        } else if (!member.isPresent()) {
            return new Result("no");
        } else {
            // storageName와 일치하는 storageCode 가져오기
            System.out.println(storage.get().getStorageCode());

            // memberId와 일피하는 memberCode 가져오기
            System.out.println(member.get().getMemberCode());

            return new Result("ok");
        }
    }

    @PostMapping("/checkManager")
    public Result checkManager(@RequestBody Member member){
        Optional<Member> memberId = memberRepository.findByMemberId(member.getMemberId());

        if (!memberId.isPresent()) {
            return new Result("overlap");
        }else{
            return new Result("ok");
        }
    }

    @GetMapping("/getStorage")
    public List<Storage> getStorages() {
        List<Storage> storageList = storageRepository.findAll();

        return storageList;
    }

    @GetMapping("/storageView/{storageCode}")
    public List<StorageBox> getStorageDetail(@PathVariable(value = "storageCode") Long storageCode){
        System.out.println(storageCode);
        Optional<Storage> storage = storageRepository.findById(storageCode);
        System.out.println("==========");
        List<StorageBox> boxList = storageBoxRepository.findByStorageCode(storage.get());
        System.out.println("==========");
        if(boxList.size()!=0){
            for (int i =0; i <boxList.size();i++ )
                System.out.println(boxList.get(i).getStorageBoxName());

        }
        System.out.println("=-=-=-=--=-==-=-=");
        System.out.println(boxList.get(0).getStorageCode().getStorageName());
        // System.out.println(storage.get().getStorageBoxCode().get(0).getStorageBoxName());
        return boxList;
    }

//    @GetMapping("/storageView/{storageCode}")
//    public List<StorageBox> getStorageBox(@PathVariable(value = "storageCode") long storageCode){
//        List<StorageBox> storageBoxList = storageBoxRepository.findByStorageCode(storageCode);
//        System.out.println(storageBoxList.get(1).getStorageCode().getStorageName());
//        System.out.println(storageBoxList.get(1).getStorageBoxName());
//        return storageBoxList;
//    }




    @GetMapping("/getStorageManger")
    public List<StorageManager> getStorageManger() {
        List<StorageManager> managerList = storageManagerRepository.findAll();

        return managerList;
    }




}
