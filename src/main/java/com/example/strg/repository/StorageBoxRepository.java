package com.example.strg.repository;

import com.example.strg.data.Storage;
import com.example.strg.data.StorageBox;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StorageBoxRepository extends JpaRepository<StorageBox, Long> {

    public List<StorageBox> findByStorageCode(Storage storageBoxCode);
}
