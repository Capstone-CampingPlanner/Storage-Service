package com.example.strg.data;

import javax.persistence.*;

@Entity
@Table(name = "MEMEQUIPMENT")
public class MemberEquipment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) //int.autoincrement
    private long memEquipmentCode;

    @ManyToOne
    @JoinColumn(name = "memberCode")
    private Member memberCode;

    @ManyToOne
    @JoinColumn(name = "assortItemCode")
    private AssortItem assortItemCode;

    @Column
    private String memEquipmentName;

    @Column
    private String memEquipmentState;

    @Column
    private int memEquipmentCount;

    public MemberEquipment() {
    }

    public MemberEquipment(long memEquipmentCode, Member memberCode, AssortItem assortItemCode, String memEquipmentName, String memEquipmentState, int memEquipmentCount) {
        this.memEquipmentCode = memEquipmentCode;
        this.memberCode = memberCode;
        this.assortItemCode = assortItemCode;
        this.memEquipmentName = memEquipmentName;
        this.memEquipmentState = memEquipmentState;
        this.memEquipmentCount = memEquipmentCount;
    }

    public long getMemEquipmentCode() {
        return memEquipmentCode;
    }

    public void setMemEquipmentCode(long memEquipmentCode) {
        this.memEquipmentCode = memEquipmentCode;
    }

    public Member getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(Member memberCode) {
        this.memberCode = memberCode;
    }

    public AssortItem getAssortItemCode() {
        return assortItemCode;
    }

    public void setAssortItemCode(AssortItem assortItemCode) {
        this.assortItemCode = assortItemCode;
    }

    public String getMemEquipmentName() {
        return memEquipmentName;
    }

    public void setMemEquipmentName(String memEquipmentName) {
        this.memEquipmentName = memEquipmentName;
    }

    public String getMemEquipmentState() {
        return memEquipmentState;
    }

    public void setMemEquipmentState(String memEquipmentState) {
        this.memEquipmentState = memEquipmentState;
    }

    public int getMemEquipmentCount() {
        return memEquipmentCount;
    }

    public void setMemEquipmentCount(int memEquipmentCount) {
        this.memEquipmentCount = memEquipmentCount;
    }
}


