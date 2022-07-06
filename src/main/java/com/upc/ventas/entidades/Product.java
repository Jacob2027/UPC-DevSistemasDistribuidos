package com.upc.ventas.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "trn_Product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private String name;
}
