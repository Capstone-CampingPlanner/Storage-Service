package com.example.strg.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ASSORT")
public class Assort {

    @Id
    private String aCode;

    private String aName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aCode", insertable = false, updatable = false)
    private Assort parent;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<Assort> highCode = new ArrayList<>();

    public Assort() {
    }

    public Assort(String aCode, String aName, Assort parent, List<Assort> highCode) {
        this.aCode = aCode;
        this.aName = aName;
        this.parent = parent;
        this.highCode = highCode;
    }

    public String getaCode() {
        return aCode;
    }

    public void setaCode(String aCode) {
        this.aCode = aCode;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public Assort getParent() {
        return parent;
    }

    public void setParent(Assort parent) {
        this.parent = parent;
    }

    public List<Assort> getHighCode() {
        return highCode;
    }

    public void setHighCode(List<Assort> highCode) {
        this.highCode = highCode;
    }
}
