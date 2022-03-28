package com.example.strg.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MEMBER")
public class Member { // 사용자

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //int.autoincrement
    private int member_code;

    @Column(length = 50)
    private int member_id;

    @Column(length = 50)
    private String member_name;

    @Column(length = 50)
    private String member_password;

    @ManyToMany
    @JoinTable(name = "STORAGEMANAGER",
            joinColumns = @JoinColumn(name = "member_code"),
            inverseJoinColumns = @JoinColumn(name = "storage_code"))
    private List<Storage> storages = new ArrayList<Storage>();

    public Member() {
    }

    public Member(int member_code, int member_id, String member_name, String member_password) {
        this.member_code = member_code;
        this.member_id = member_id;
        this.member_name = member_name;
        this.member_password = member_password;
    }

    public int getMember_code() {
        return member_code;
    }

    public void setMember_code(int member_code) {
        this.member_code = member_code;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getMember_password() {
        return member_password;
    }

    public void setMember_password(String member_password) {
        this.member_password = member_password;
    }
}
