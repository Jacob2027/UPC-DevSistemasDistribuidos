package com.upc.ventas.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "trn_Product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private String name;
    private double price;
    private int pieces;
    @ManyToOne
    @JoinColumn(name = "family_code")
    private Family family;
    @ManyToOne
    @JoinColumn(name = "specie_code")
    //@JsonIgnore
    private Specie specie;
    private boolean active;//state
    public Product() {
    }

    public Product(Long code, String name, double price, int pieces, Family family, Specie specie, boolean active) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.pieces = pieces;
        this.family = family;
        this.specie = specie;
        this.active = active;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Specie getSpecie() {
        return specie;
    }

    public void setSpecie(Specie specie) {
        this.specie = specie;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
