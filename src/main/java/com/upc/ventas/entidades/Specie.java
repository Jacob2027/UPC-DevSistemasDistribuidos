package com.upc.ventas.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "trn_Specie")
public class Specie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private String name;

    public Specie() {
    }

    public Specie(Long code, String name) {
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
        return "Specie{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
