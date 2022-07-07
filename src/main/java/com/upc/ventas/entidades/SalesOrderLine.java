package com.upc.ventas.entidades;

import javax.persistence.*;

@Entity
@Table(name = "trn_SalesOrderLine")
public class SalesOrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    @ManyToOne
    @JoinColumn(name = "product_code")
    private Product product;
    private double unitPrice;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "sales_order_code")
    private SalesOrder salesOrder;

    public SalesOrder getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(SalesOrder salesOrder) {
        this.salesOrder = salesOrder;
    }

    public SalesOrderLine() {
    }

    public SalesOrderLine(Long code, Product product, double unitPrice, int quantity, SalesOrder salesOrder) {
        this.code = code;
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.salesOrder = salesOrder;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
