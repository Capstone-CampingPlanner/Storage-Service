package com.example.strg.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "STORAGEBOX")
public class StorageBox {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //int.autoincrement
    private int storage_box_code;

    @ManyToOne
    @JoinColumn(name = "storage_code")
    private Storage storage_code;

    @Column
    private String storage_box_name;

    @Column
    private String storage_box_type;

    @Column
    private String storage_box_state;

    @ManyToMany(mappedBy = "storageBoxes")
    private List<OrderList> orderLists;

    public StorageBox() {
    }

    public StorageBox(int storage_box_code, Storage storage_code, String storage_box_name, String storage_box_type, String storage_box_state) {
        this.storage_box_code = storage_box_code;
        this.storage_code = storage_code;
        this.storage_box_name = storage_box_name;
        this.storage_box_type = storage_box_type;
        this.storage_box_state = storage_box_state;
    }

    public int getStorage_box_code() {
        return storage_box_code;
    }

    public void setStorage_box_code(int storage_box_code) {
        this.storage_box_code = storage_box_code;
    }

    public Storage getStorage_code() {
        return storage_code;
    }

    public void setStorage_code(Storage storage_code) {
        this.storage_code = storage_code;
    }

    public String getStorage_box_name() {
        return storage_box_name;
    }

    public void setStorage_box_name(String storage_box_name) {
        this.storage_box_name = storage_box_name;
    }

    public String getStorage_box_type() {
        return storage_box_type;
    }

    public void setStorage_box_type(String storage_box_type) {
        this.storage_box_type = storage_box_type;
    }

    public String getStorage_box_state() {
        return storage_box_state;
    }

    public void setStorage_box_state(String storage_box_state) {
        this.storage_box_state = storage_box_state;
    }
}


