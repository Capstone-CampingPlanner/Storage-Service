package com.example.strg.data;

import javax.persistence.*;

@Entity
@Table(name="STORAGEMANAGER")
public class StorageManager {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long storageManagerCode;

    @ManyToOne
    @JoinColumn(name = "memberCode")
    private Member memberCode;

    @ManyToOne
    @JoinColumn(name="storageCode")
    private Storage storageCode;

    public StorageManager() {
    }

    public StorageManager(Member memberCode, Storage storageCode) {
        this.memberCode = memberCode;
        this.storageCode = storageCode;
    }

    public StorageManager(long storageManagerCode, Member memberCode, Storage storageCode) {
        this.storageManagerCode = storageManagerCode;
        this.memberCode = memberCode;
        this.storageCode = storageCode;
    }

    public long getStorageManagerCode() {
        return storageManagerCode;
    }

    public void setStorageManagerCode(long storageManagerCode) {
        this.storageManagerCode = storageManagerCode;
    }

    public Member getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(Member memberCode) {
        this.memberCode = memberCode;
    }

    public Storage getStorageCode() {
        return storageCode;
    }

    public void setStorageCode(Storage storageCode) {
        this.storageCode = storageCode;
    }
}
