package com.example.strg.service;

import com.example.strg.data.Member;
import com.example.strg.data.Storage;
import com.example.strg.repository.MemberRepository;
import com.example.strg.repository.StorageBoxRepository;
import com.example.strg.repository.StorageManagerRepository;
import com.example.strg.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StorageService {
    @Autowired
    StorageBoxRepository storageBoxRepository;

    @Autowired
    StorageRepository storageRepository;

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    StorageManagerRepository storageManagerRepository;

    public Storage findStorageName(String storageName){
        Optional<Storage> findStorage = storageRepository.findByStorageName(storageName);
        return findStorage.get();
    }




}
