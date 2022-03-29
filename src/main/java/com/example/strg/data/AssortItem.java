package com.example.strg.data;

import javax.persistence.*;
<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4

@Entity
@Table(name = "ASSORTITEM")
public class AssortItem {

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long assortItemCode;

    @Column
    private String assortItemName;
=======
    private int assort_item_code;

    @Column
    private String assort_item_name;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "assort_item_code")
//    private AssortItem parent;
//
//    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
//    private List<AssortItem> assort_item_high_code = new ArrayList<>();
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4

    public AssortItem() {
    }

<<<<<<< HEAD
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
=======
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
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4
}
