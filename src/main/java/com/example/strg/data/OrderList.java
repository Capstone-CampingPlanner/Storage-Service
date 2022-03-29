package com.example.strg.data;

import javax.persistence.*;

@Entity
@Table(name = "ORDERLIST")
public class OrderList {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO) //int.autoincrement
    private long orderCode; // 주문코드

    @ManyToOne
    @JoinColumn(name="memberCode")
    private Member memberCode;

    @Column
    private int orderPrice;

    @Column
    private String orderType;

    public OrderList() {
    }

    public OrderList(long orderCode, Member memberCode, int orderPrice, String orderType) {
        this.orderCode = orderCode;
        this.memberCode = memberCode;
        this.orderPrice = orderPrice;
        this.orderType = orderType;
    }

    public long getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(long orderCode) {
        this.orderCode = orderCode;
    }

    public Member getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(Member memberCode) {
        this.memberCode = memberCode;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
