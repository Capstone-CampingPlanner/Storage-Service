package com.example.strg.data;

public class payStorageBox {

    private String userId;
    private long storageBoxCode;

    public payStorageBox() {
    }

    public payStorageBox(String userId, long storageBoxCode) {
        this.userId = userId;
        this.storageBoxCode = storageBoxCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getStorageBoxCode() {
        return storageBoxCode;
    }

    public void setStorageBoxCode(long storageBoxCode) {
        this.storageBoxCode = storageBoxCode;
    }
}
