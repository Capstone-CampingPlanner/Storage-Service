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
    @JoinColumn(name = "aCode", referencedColumnName = "aCode", insertable = false, updatable = false)
    private Assort parent;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<Assort> children = new ArrayList<>();

    public Assort() {
    }

    public Assort(String aCode, String aName, Assort parent, List<Assort> children) {
        this.aCode = aCode;
        this.aName = aName;
        this.parent = parent;
        this.children = children;
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

    public List<Assort> getChildren() {
        return children;
    }

    public void setChildren(List<Assort> children) {
        this.children = children;
    }
}
