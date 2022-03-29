package com.example.strg.data;

import javax.persistence.*;
<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4

@Entity
@Table(name = "MEMEQUIPMENT")
public class MemberEquipment {

    @Id
<<<<<<< HEAD
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
=======
    @GeneratedValue(strategy=GenerationType.IDENTITY) //int.autoincrement
    private int mem_equipment_code;

    @ManyToOne
    @JoinColumn(name = "member_code")
    private Member member_code;

    @ManyToOne
    @JoinColumn(name = "assort_item_code")
    private AssortItem assort_item_code;

    @Column
    private int mem_equipment_name;

    @Column
    private int mem_equipment_state;

    @Column
    private int mem_equipment_count;

    @ManyToMany
    @JoinTable(name = "STRGEQUIPMENT",
            joinColumns = @JoinColumn(name = "mem_equipment_code"),
            inverseJoinColumns = @JoinColumn(name = "order_code"))
    private List<OrderList> orderlists = new ArrayList<OrderList>();
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4

    public MemberEquipment() {
    }

<<<<<<< HEAD
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

=======
    public MemberEquipment(int mem_equipment_code, Member member_code, AssortItem assort_item_code, int mem_equipment_name, int mem_equipment_state, int mem_equipment_count) {
        this.mem_equipment_code = mem_equipment_code;
        this.member_code = member_code;
        this.assort_item_code = assort_item_code;
        this.mem_equipment_name = mem_equipment_name;
        this.mem_equipment_state = mem_equipment_state;
        this.mem_equipment_count = mem_equipment_count;
    }

    public int getMem_equipment_code() {
        return mem_equipment_code;
    }

    public void setMem_equipment_code(int mem_equipment_code) {
        this.mem_equipment_code = mem_equipment_code;
    }

    public Member getMember_code() {
        return member_code;
    }

    public void setMember_code(Member member_code) {
        this.member_code = member_code;
    }

    public AssortItem getAssort_item_code() {
        return assort_item_code;
    }

    public void setAssort_item_code(AssortItem assort_item_code) {
        this.assort_item_code = assort_item_code;
    }

    public int getMem_equipment_name() {
        return mem_equipment_name;
    }

    public void setMem_equipment_name(int mem_equipment_name) {
        this.mem_equipment_name = mem_equipment_name;
    }

    public int getMem_equipment_state() {
        return mem_equipment_state;
    }

    public void setMem_equipment_state(int mem_equipment_state) {
        this.mem_equipment_state = mem_equipment_state;
    }

    public int getMem_equipment_count() {
        return mem_equipment_count;
    }

    public void setMem_equipment_count(int mem_equipment_count) {
        this.mem_equipment_count = mem_equipment_count;
    }
}
>>>>>>> dc19758fb0144b1b5929ccff6ae52ec37e618db4
