package com.example.strg.data;

import javax.persistence.*;

@Entity
@Table(name = "MEMBER")
public class Member { // 사용자

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long memberCode;

    @Column(length = 50)
    private String memberId;

    @Column(length = 50)
    private String memberName;

    @Column(length = 50)
    private String memberPassword;

    public Member() {
    }

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
    }
}
