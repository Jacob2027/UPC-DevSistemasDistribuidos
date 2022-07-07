package com.upc.ventas.rest;

import com.upc.ventas.entidades.Family;
import com.upc.ventas.entidades.Product;
import com.upc.ventas.entidades.Specie;
import com.upc.ventas.negocio.FamilyBusiness;
import com.upc.ventas.negocio.ProductBusiness;
import com.upc.ventas.negocio.SpecieBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TropicalInvertebratesRest {
    @Autowired    FamilyBusiness familyBusiness;
    @Autowired    SpecieBusiness specieBusiness;
    @Autowired    ProductBusiness productBusiness;
    @PostMapping("/trn/family")
    public Family registrar(@RequestBody Family family) {
        return familyBusiness.createFamily(family);
    }

    @PostMapping("/trn/specie")
    public Specie registrar(@RequestBody Specie specie) {
        return specieBusiness.createSpecie(specie);
    }
    @PostMapping("/trn/product")
    public Product registrar(@RequestBody Product product) {
        return productBusiness.createProduct(product);
    }

}
