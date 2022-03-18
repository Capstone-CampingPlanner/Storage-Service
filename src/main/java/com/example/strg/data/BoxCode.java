package com.example.strg.data;

import java.io.Serializable;
import java.util.Objects;

public class BoxCode implements Serializable {
    private int bCode;
    private String sCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoxCode boxCode = (BoxCode) o;
        return sCode == boxCode.sCode && sCode == boxCode.sCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bCode, sCode);
    }

    public int getbCode() {
        return bCode;
    }

    public void setbCode(int bCode) {
        this.bCode = bCode;
    }

    public String getdCode() {
        return sCode;
    }

    public void setdCode(String sCode) {
        this.sCode = sCode;
    }

    public BoxCode() {
    }

    public BoxCode(int bCode, String sCode) {
        this.bCode = bCode;
        this.sCode = sCode;
    }
}
