package com.example.strg.data;

import javax.persistence.*;

@Entity
@Table(name = "MEMBER")
public class Member { // 사용자

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long memberCode;

    @Column(length = 50)
    private String memberId;

    @Column(length = 50)
    private String memberName;

    @Column(length = 50)
    private String memberPassword;
=======
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
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4

    public Member() {
    }

<<<<<<< HEAD
    public Member(long memberCode, String memberId, String memberName, String memberPassword) {
        this.memberCode = memberCode;
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberPassword = memberPassword;
    }

    public long getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(long memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
=======
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
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4
    }
}
