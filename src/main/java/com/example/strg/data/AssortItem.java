package com.example.strg.data;

import javax.persistence.*;

@Entity
@Table(name = "ASSORTITEM")
public class AssortItem {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long assortItemCode;

    @Column
    private String assortItemName;
    private int assort_item_code;

    @Column
    private String assort_item_name;

    public AssortItem() {
    }

    public AssortItem(long assortItemCode, String assortItemName) {
        this.assortItemCode = assortItemCode;
        this.assortItemName = assortItemName;
    }

    public long getAssortItemCode() {
        return assortItemCode;
    }

    public void setAssortItemCode(long assortItemCode) {
        this.assortItemCode = assortItemCode;
    }

    public String getAssortItemName() {
        return assortItemName;
    }

    public void setAssortItemName(String assortItemName) {
        this.assortItemName = assortItemName;
    }

    public AssortItem(int assort_item_code, String assort_item_name) {
        this.assort_item_code = assort_item_code;
        this.assort_item_name = assort_item_name;
    }

    public int getAssort_item_code() {
        return assort_item_code;
    }

    public void setAssort_item_code(int assort_item_code) {
        this.assort_item_code = assort_item_code;
    }

    public String getAssort_item_name() {
        return assort_item_name;
    }

    public void setAssort_item_name(String assort_item_name) {
        this.assort_item_name = assort_item_name;
    }

}
