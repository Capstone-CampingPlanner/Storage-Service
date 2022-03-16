package com.example.strg.data;

import javax.persistence.*;

@Entity
@IdClass(BCode.class)
@Table(name = "BUSINESS")
public class Business {

    @Id
    private int bCode;

    @Id
    @ManyToOne
    @JoinColumn(name = "mCode")
    private Member mCode;



    public Business() {
    }

    public Business(int bCode, Member mCode) {
        this.bCode = bCode;
        this.mCode = mCode;
    }

    public int getbCode() {
        return bCode;
    }

    public void setbCode(int bCode) {
        this.bCode = bCode;
    }

    public Member getmCode() {
        return mCode;
    }

    public void setmCode(Member mCode) {
        this.mCode = mCode;
    }
}
