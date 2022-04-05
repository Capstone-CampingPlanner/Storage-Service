package com.example.strg.data;

import javax.persistence.*;

@Entity
@Table(name = "DELIVERY")
public class Delivery {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long deliveryCode;

    @OneToOne
    @JoinColumn(name = "orderCode")
    private OrderList orderCode;

    @Column
    private String deliveryName;

    @Column
    private String deliveryPh;

    @Column
    private String deliveryState;

    public Delivery() {
    }

    public Delivery(long deliveryCode, OrderList orderCode, String deliveryName, String deliveryPh, String deliveryState) {
        this.deliveryCode = deliveryCode;
        this.orderCode = orderCode;
        this.deliveryName = deliveryName;
        this.deliveryPh = deliveryPh;
        this.deliveryState = deliveryState;
    }

    public long getDeliveryCode() {
        return deliveryCode;
    }

    public void setDeliveryCode(long deliveryCode) {
        this.deliveryCode = deliveryCode;
    }

    public OrderList getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(OrderList orderCode) {
        this.orderCode = orderCode;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryPh() {
        return deliveryPh;
    }

    public void setDeliveryPh(String deliveryPh) {
        this.deliveryPh = deliveryPh;
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }
}
