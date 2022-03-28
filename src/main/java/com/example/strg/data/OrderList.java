package com.example.strg.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORDERLIST")
public class OrderList {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //int.autoincrement
    private int order_code; // 주문코드

    @ManyToOne
    @JoinColumn(name="member_code")
    private Member member_code;

    @Column
    private int order_price;

    @Column
    private String order_type;

    @ManyToMany(mappedBy = "orderlists")
    private List<MemberEquipment> memberEquipments;

    @ManyToMany
    @JoinTable(name = "USESTORAGEBOX",
            joinColumns = @JoinColumn(name = "order_code"),
            inverseJoinColumns = @JoinColumn(name = "storage_box_code"))
    private List<StorageBox> storageBoxes = new ArrayList<StorageBox>();

    public OrderList() {
    }

    public OrderList(int order_code, Member member_code, int order_price, String order_type) {
        this.order_code = order_code;
        this.member_code = member_code;
        this.order_price = order_price;
        this.order_type = order_type;
    }

    public int getOrder_code() {
        return order_code;
    }

    public void setOrder_code(int order_code) {
        this.order_code = order_code;
    }

    public Member getMember_code() {
        return member_code;
    }

    public void setMember_code(Member member_code) {
        this.member_code = member_code;
    }

    public int getOrder_price() {
        return order_price;
    }

    public void setOrder_price(int order_price) {
        this.order_price = order_price;
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }

    public List<MemberEquipment> getMemberEquipments() {
        return memberEquipments;
    }

    public void setMemberEquipments(List<MemberEquipment> memberEquipments) {
        this.memberEquipments = memberEquipments;
    }
}
