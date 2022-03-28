package com.example.strg.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MEMEQUIPMENT")
public class MemberEquipment {

    @Id
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

    public MemberEquipment() {
    }

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
