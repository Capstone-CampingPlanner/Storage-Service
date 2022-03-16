package com.example.strg.data;

import java.io.Serializable;
import java.util.Objects;

public class BoxCode implements Serializable {
    private int bCode;
    private int dCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoxCode boxCode = (BoxCode) o;
        return bCode == boxCode.bCode && dCode == boxCode.dCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bCode, dCode);
    }

    public int getbCode() {
        return bCode;
    }

    public void setbCode(int bCode) {
        this.bCode = bCode;
    }

    public int getdCode() {
        return dCode;
    }

    public void setdCode(int dCode) {
        this.dCode = dCode;
    }

    public BoxCode() {
    }

    public BoxCode(int bCode, int dCode) {
        this.bCode = bCode;
        this.dCode = dCode;
    }
}
