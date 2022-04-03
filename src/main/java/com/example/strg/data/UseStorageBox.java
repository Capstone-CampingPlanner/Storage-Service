package com.example.strg.data;

import javax.persistence.*;

@Entity
@Table(name = "USESTORAGEBOX")
public class UseStorageBox {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long useStorageBoxCode;

    @ManyToOne
    @JoinColumn(name = "storageBoxCode")
    private StorageBox storageBoxCode;

    @ManyToOne
    @JoinColumn(name = "orderCode")
    private OrderList orderCode;

    public UseStorageBox() {
    }

    public UseStorageBox(long useStorageBoxCode, StorageBox storageBoxCode, OrderList orderCode) {
        this.useStorageBoxCode = useStorageBoxCode;
        this.storageBoxCode = storageBoxCode;
        this.orderCode = orderCode;
    }



    public long getUseStorageBoxCode() {
        return useStorageBoxCode;
    }

    public void setUseStorageBoxCode(long useStorageBoxCode) {
        this.useStorageBoxCode = useStorageBoxCode;
    }

    public StorageBox getStorageBoxCode() {
        return storageBoxCode;
    }

    public void setStorageBoxCode(StorageBox storageBoxCode) {
        this.storageBoxCode = storageBoxCode;
    }

    public OrderList getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(OrderList orderCode) {
        this.orderCode = orderCode;
    }
}
