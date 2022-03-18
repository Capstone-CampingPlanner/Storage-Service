package com.example.strg.data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="STORAGE")
public class Storage {  // 보관소

    @Id
    private String sCode;

    @Column(length = 50)
    private String sName;

    private String zipCode;

    private String sAddress;

    @ManyToMany(mappedBy = "storages")
    private List<Member> members;

    public Storage() {
    }

    public Storage(String sCode, String sName, String zipCode, String dAddress) {
        this.sCode = sCode;
        this.sName = sName;
        this.zipCode = zipCode;
        this.sAddress = dAddress;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
