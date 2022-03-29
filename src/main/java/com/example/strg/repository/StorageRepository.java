package com.example.strg.repository;

import com.example.strg.data.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<Storage, Long> {
    public Optional<Storage> findByStorageName(String storageName);
}
