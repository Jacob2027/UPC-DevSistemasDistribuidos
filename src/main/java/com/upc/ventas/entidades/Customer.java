package com.upc.ventas.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trn_Customer")
public class Customer {
    @Id
    private int documentNumber;
    private String fullname;
    private int mobilePhone;
    private String email;
    private String country;
    private String addressCity;
    private boolean extranjero;

    @OneToMany(mappedBy="customer", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    private List<SalesOrder> salesOrders;

    public Customer() {
    }

    public Customer(int documentNumber, String fullname, int mobilePhone, String email, String country, String addressCity, boolean extranjero, List<SalesOrder> salesOrders) {
        this.documentNumber = documentNumber;
        this.fullname = fullname;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.country = country;
        this.addressCity = addressCity;
        this.extranjero = extranjero;
        this.salesOrders = salesOrders;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public boolean isExtranjero() {
        return extranjero;
    }

    public void setExtranjero(boolean extranjero) {
        this.extranjero = extranjero;
    }

    public List<SalesOrder> getSalesOrders() {
        return salesOrders;
    }

    public void setSalesOrders(List<SalesOrder> salesOrders) {
        this.salesOrders = salesOrders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "documentNumber=" + documentNumber +
                ", fullname='" + fullname + '\'' +
                ", mobilePhone=" + mobilePhone +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", extranjero=" + extranjero +
                ", salesOrders=" + salesOrders +
                '}';
    }
}
