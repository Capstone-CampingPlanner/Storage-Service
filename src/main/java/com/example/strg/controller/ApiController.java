package com.example.strg.controller;

import com.example.strg.data.Result;
import com.example.strg.data.Storage;
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

    @PostMapping("/postStorage")
    public Result postStorage(@RequestBody Storage storage){
        Optional<Storage> findStrg = storageRepository.findById(storage.getStorage_code());
        if(findStrg.isPresent()){
            return new Result("no");
        }else{
            storageRepository.save(storage);
        }
        return new Result("ok");
    }

    @GetMapping("/getStorages")
    public List<Storage> getStorages(){
        List<Storage> storageList = storageRepository.findAll();

        return storageList;
    }


}
