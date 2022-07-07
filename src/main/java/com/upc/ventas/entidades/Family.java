package com.upc.ventas.entidades;

import javax.persistence.*;

@Entity
@Table(name = "trn_Family")
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private String name;

    public Family() {
    }

    public Family(Long code, String name) {
        this.code = code;
        this.name = name;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Family{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
