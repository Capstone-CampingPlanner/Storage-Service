package com.example.strg.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEPOSITORY")
public class Depository {  // 보관소

    @Id
    private int dCode;

    @Column(length = 50)
    private String dName;

    private String zipCode;

    private String dAddress;

    public Depository() {
    }

    public Depository(int dCode, String dName, String zipCode, String dAddress) {
        this.dCode = dCode;
        this.dName = dName;
        this.zipCode = zipCode;
        this.dAddress = dAddress;
    }

    public int getdCode() {
        return dCode;
    }

    public void setdCode(int dCode) {
        this.dCode = dCode;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getdAddress() {
        return dAddress;
    }

    public void setdAddress(String dAddress) {
        this.dAddress = dAddress;
    }
}
