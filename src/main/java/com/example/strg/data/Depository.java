package com.example.strg.data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="DEPOSITORY")
public class Depository {  // 보관소

    @Id
    private int dCode;

    @Column(length = 50)
    private String dName;

    private String zipCode;

    private String dAddress;

    @ManyToMany(mappedBy = "depositorys")
    private List<Member> members;

    public Depository() {
    }

    public Depository(int dCode, String dName, String zipCode, String dAddress) {
        this.dCode = dCode;
        this.dName = dName;
        this.zipCode = zipCode;
        this.dAddress = dAddress;
    }

    public Depository(int dCode, String dName, String zipCode, String dAddress, List<Member> members) {
        this.dCode = dCode;
        this.dName = dName;
        this.zipCode = zipCode;
        this.dAddress = dAddress;
        this.members = members;
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

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
