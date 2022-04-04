package com.example.strg.repository;

import com.example.strg.data.Member;
import com.example.strg.data.Storage;
import com.example.strg.data.StorageManager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StorageManagerRepository extends JpaRepository<StorageManager, Long> {
    List<StorageManager> findByStorageCode(Storage storage);
    Optional<StorageManager> findByMemberCode(Optional<Member> member);
}
