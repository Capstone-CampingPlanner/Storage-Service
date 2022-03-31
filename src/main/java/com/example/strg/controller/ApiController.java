package com.example.strg.controller;

import com.example.strg.data.Member;
import com.example.strg.data.Result;
import com.example.strg.data.Storage;
import com.example.strg.data.StorageManager;
import com.example.strg.repository.MemberRepository;
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



    @GetMapping("/getStorages")
    public List<Storage> getStorages() {
        List<Storage> storageList = storageRepository.findAll();

        return storageList;
    }

    @GetMapping("/getStorageManger")
    public List<StorageManager> getStorageManger() {
        List<StorageManager> managerList = storageManagerRepository.findAll();

        return managerList;
    }


}
