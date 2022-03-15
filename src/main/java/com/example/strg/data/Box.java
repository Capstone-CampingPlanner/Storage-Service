package com.example.strg.data;

import javax.persistence.*;

@Entity
@IdClass(BCode.class)
@Table(name = "BOX")
public class Box {

    @Id
    private int bCode;

    @Id
    @ManyToOne
    @JoinColumn(name = "dCode")
    private Depository dCode;

    private String bName;

    private String bType;

    private String bState;

    public Box() {
    }

    public Box(int bCode, Depository dCode, String bName, String bType, String bState) {
        this.bCode = bCode;
        this.dCode = dCode;
        this.bName = bName;
        this.bType = bType;
        this.bState = bState;
    }

    public long getbCode() {
        return bCode;
    }

    public void setbCode(int bCode) {
        this.bCode = bCode;
    }

    public Depository getdCode() {
        return dCode;
    }

    public void setdCode(Depository dCode) {
        this.dCode = dCode;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    public String getbState() {
        return bState;
    }

    public void setbState(String bState) {
        this.bState = bState;
    }
}
