package com.example.strg.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ASSORTITEM")
public class AssortItem {

    @Id
    private int assort_item_code;

    @Column
    private String assort_item_name;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "assort_item_code")
//    private AssortItem parent;
//
//    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
//    private List<AssortItem> assort_item_high_code = new ArrayList<>();

    public AssortItem() {
    }

//    public AssortItem(int assort_item_code, String assort_item_name, List<AssortItem> assort_item_high_code) {
//        this.assort_item_code = assort_item_code;
//        this.assort_item_name = assort_item_name;
//        this.assort_item_high_code = assort_item_high_code;
//    }


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

//    public AssortItem getParent() {
//        return parent;
//    }
//
//    public void setParent(AssortItem parent) {
//        this.parent = parent;
//    }
//
//    public List<AssortItem> getAssort_item_high_code() {
//        return assort_item_high_code;
//    }
//
//    public void setAssort_item_high_code(List<AssortItem> assort_item_high_code) {
//        this.assort_item_high_code = assort_item_high_code;
//    }
}
