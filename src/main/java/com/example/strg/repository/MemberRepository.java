package com.example.strg.repository;

import com.example.strg.data.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository <Member, Long> {
    public Optional<Member> findByMemberId(String memberId);
}
