package com.example.strg.data;

import javax.persistence.*;

@Entity
@Table(name="DepManager")
public class DepManager {// 보관소 관리자

    @Id
    @ManyToOne
    @JoinColumn(name = "Mcode")
    private Member mCode;

    @Id
    @ManyToOne
    @JoinColumn(name = "dCode")
    private Depository dCode;

    public DepManager(Member mCode, Depository dCode) {
        this.mCode = mCode;
        this.dCode = dCode;
    }

    public DepManager() {

    }

    public Member getmCode() {
        return mCode;
    }

    public void setmCode(Member mCode) {
        this.mCode = mCode;
    }

    public Depository getdCode() {
        return dCode;
    }

    public void setdCode(Depository dCode) {
        this.dCode = dCode;
    }
}
