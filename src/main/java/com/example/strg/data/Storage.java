package com.example.strg.data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="STORAGE")
public class Storage {  // 보관소

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //int.autoincrement
    private int storage_code;

    @Column(length = 50)
    private String storage_name;

    @Column(length = 50)
    private String storage_zipcode;

    @Column(length = 50)
    private String storage_address;

    @ManyToMany(mappedBy = "storages")
    private List<Member> members;

    public Storage() {
    }

    public Storage(int storage_code, String storage_name, String storage_zipcode, String storage_address) {
        this.storage_code = storage_code;
        this.storage_name = storage_name;
        this.storage_zipcode = storage_zipcode;
        this.storage_address = storage_address;
    }

    public int getStorage_code() {
        return storage_code;
    }

    public void setStorage_code(int storage_code) {
        this.storage_code = storage_code;
    }

    public String getsStorage_name() {
        return storage_name;
    }

    public void setsStorage_name(String sName) {
        this.storage_name = sName;
    }

    public String getStorage_zipcode() {
        return storage_zipcode;
    }

    public void setStorage_zipcode(String zipCode) {
        this.storage_zipcode = zipCode;
    }

    public String getsStorage_address() {
        return storage_address;
    }

    public void setsStorage_address(String sAddress) {
        this.storage_address = sAddress;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
