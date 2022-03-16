package com.example.strg.data;

import java.io.Serializable;
import java.util.Objects;

public class BCode implements Serializable {

    private int bCode;
    private int mCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BCode bCode1 = (BCode) o;
        return bCode == bCode1.bCode && mCode == bCode1.mCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bCode, mCode);
    }

    public int getbCode() {
        return bCode;
    }

    public void setbCode(int bCode) {
        this.bCode = bCode;
    }

    public int getmCode() {
        return mCode;
    }

    public void setmCode(int mCode) {
        this.mCode = mCode;
    }

    public BCode() {
    }

    public BCode(int bCode, int mCode) {
        this.bCode = bCode;
        this.mCode = mCode;
    }
}
