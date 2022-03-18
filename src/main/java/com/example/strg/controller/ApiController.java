package com.example.strg.controller;

import com.example.strg.data.Result;
import com.example.strg.data.Storage;
import com.example.strg.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private StorageRepository storageRepository;

    @PostMapping("/addStrg")
    public Result addDep(@RequestBody Storage storage){
        Optional<Storage> findStrg = storageRepository.findById(storage.getsCode());
        if(findStrg.isPresent()){
            return new Result("no");
        }else{
            storageRepository.save(storage);
        }
        return new Result("ok");
    }

    @GetMapping("/asdf")
    public String asdf(){
        return "asdf";
    }


}
