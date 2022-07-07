package com.upc.ventas.entidades;

import javax.persistence.*;

@Entity
@Table(name = "trn_Provider")
public class Provider {
    @Id
    private int documentNumber;
    private String fullname;
    private String email;
    private int mobilePhone;

    public Provider() {
    }

    public Provider(int documentNumber, String fullname, String email, int mobilePhone) {
        this.documentNumber = documentNumber;
        this.fullname = fullname;
        this.email = email;
        this.mobilePhone = mobilePhone;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
