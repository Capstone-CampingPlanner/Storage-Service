package com.example.strg.data;

import javax.persistence.*;

@Entity
@Table(name="STORAGE")
public class Storage {  // 보관소

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy=GenerationType.AUTO) //int.autoincrement
    private long storageCode;

    @Column(length = 50)
    private String storageName;

    @Column(length = 50)
    private String storageZipcode;
=======
    @GeneratedValue(strategy=GenerationType.IDENTITY) //int.autoincrement
    private int storage_code;

    @Column(length = 50)
    private String storage_name;

    @Column(length = 50)
    private String storage_zipcode;

    @Column(length = 50)
    private String storage_address;
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4

    @Column(length = 50)
    private String storageAddress;

    public Storage() {
    }

<<<<<<< HEAD
    public Storage(long storageCode, String storageName, String storageZipcode, String storageAddress) {
        this.storageCode = storageCode;
        this.storageName = storageName;
        this.storageZipcode = storageZipcode;
        this.storageAddress = storageAddress;
    }

    public long getStorageCode() {
        return storageCode;
    }

    public void setStorageCode(long storageCode) {
        this.storageCode = storageCode;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getStorageZipcode() {
        return storageZipcode;
    }

    public void setStorageZipcode(String storageZipcode) {
        this.storageZipcode = storageZipcode;
=======
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
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4
    }

    public String getStorageAddress() {
        return storageAddress;
    }

    public void setStorageAddress(String storageAddress) {
        this.storageAddress = storageAddress;
    }
}
