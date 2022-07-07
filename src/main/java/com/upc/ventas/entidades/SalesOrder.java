package com.upc.ventas.entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "trn_SalesOrder")
public class SalesOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private double totalPrice;
    private String addressCity;
    private double iva;
    private double totalIva;
    private String description;
    private Date createdon;
    @ManyToOne
    @JoinColumn(name = "customer_document_number")
    private Customer customer;
    @OneToMany(mappedBy="salesOrder", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    private List<SalesOrderLine> salesOrderLines;

    public SalesOrder() {
    }

    public SalesOrder(Long code, double totalPrice, String addressCity, double iva, double totalIva, String description, Date createdon, Customer customer, List<SalesOrderLine> salesOrderLines) {
        this.code = code;
        this.totalPrice = totalPrice;
        this.addressCity = addressCity;
        this.iva = iva;
        this.totalIva = totalIva;
        this.description = description;
        this.createdon = createdon;
        this.customer = customer;
        this.salesOrderLines = salesOrderLines;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(double totalIva) {
        this.totalIva = totalIva;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<SalesOrderLine> getSalesOrderLines() {
        return salesOrderLines;
    }

    public void setSalesOrderLines(List<SalesOrderLine> salesOrderLines) {
        this.salesOrderLines = salesOrderLines;
    }
}
