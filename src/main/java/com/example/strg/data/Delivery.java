//package com.example.strg.data;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "DELIVERY")
//public class Delivery {
//
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    private long delivery_code;
//
//    @OneToOne
//    @JoinColumn(name = "order_code")
//    private OrderList order_code;
//
//    @Column
//    private String delivery_name;
//
//    @Column
//    private String delivery_ph;
//
//    @Column
//    private String delivery_state;
//
//    public Delivery() {
//    }
//
//    public Delivery(long delivery_code, OrderList order_code, String delivery_name, String delivery_ph, String delivery_state) {
//        this.delivery_code = delivery_code;
//        this.order_code = order_code;
//        this.delivery_name = delivery_name;
//        this.delivery_ph = delivery_ph;
//        this.delivery_state = delivery_state;
//    }
//
//    public long getDelivery_code() {
//        return delivery_code;
//    }
//
//    public void setDelivery_code(long delivery_code) {
//        this.delivery_code = delivery_code;
//    }
//
//    public OrderList getOrder_code() {
//        return order_code;
//    }
//
//    public void setOrder_code(OrderList order_code) {
//        this.order_code = order_code;
//    }
//
//    public String getDelivery_name() {
//        return delivery_name;
//    }
//
//    public void setDelivery_name(String delivery_name) {
//        this.delivery_name = delivery_name;
//    }
//
//    public String getDelivery_ph() {
//        return delivery_ph;
//    }
//
//    public void setDelivery_ph(String delivery_ph) {
//        this.delivery_ph = delivery_ph;
//    }
//
//    public String getDelivery_state() {
//        return delivery_state;
//    }
//
//    public void setDelivery_state(String delivery_state) {
//        this.delivery_state = delivery_state;
//    }
//}
