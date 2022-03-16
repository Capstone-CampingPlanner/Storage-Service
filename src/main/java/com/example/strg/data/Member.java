package com.example.strg.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MEMBER")
public class Member { // 사용자

    @Id
    private int mCode;

    @Column(length = 50)
    private int mId;
    @Column(length = 50)
    private String mName;

    @Column(length = 50)
    private String mPsw;

    @ManyToMany
    @JoinTable(name = "DEPMANAGER",
            joinColumns = @JoinColumn(name = "mCode"),
            inverseJoinColumns = @JoinColumn(name = "dCode"))
    private List<Depository> depositorys = new ArrayList<Depository>();

    public Member() {
    }

    public Member(int mCode, int mId, String mName, String mPsw, List<Depository> depositorys) {
        this.mCode = mCode;
        this.mId = mId;
        this.mName = mName;
        this.mPsw = mPsw;
        this.depositorys = depositorys;
    }

    public Member(int mCode, int mId, String mName, String mPsw) {
        this.mCode = mCode;
        this.mId = mId;
        this.mName = mName;
        this.mPsw = mPsw;
    }

    public int getmCode() {
        return mCode;
    }

    public void setmCode(int mCode) {
        this.mCode = mCode;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPsw() {
        return mPsw;
    }

    public void setmPsw(String mPsw) {
        this.mPsw = mPsw;
    }

    public List<Depository> getDepositorys() {
        return depositorys;
    }

    public void setDepositorys(List<Depository> depositorys) {
        this.depositorys = depositorys;
    }
}
