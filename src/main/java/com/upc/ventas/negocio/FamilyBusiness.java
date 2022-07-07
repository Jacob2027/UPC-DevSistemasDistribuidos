package com.upc.ventas.negocio;

import com.upc.ventas.entidades.Family;
import com.upc.ventas.repositorios.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyBusiness {
    @Autowired
    FamilyRepository familyRepository;
    //Family class functions
    public Family createFamily(Family family){
        return familyRepository.save(family);
    }
    public List<Family> getAllFamily(){
        return familyRepository.findAll();
    }
    public Family getFamily_by_code(Long code){
        return familyRepository.findById(code).get();
    }
    public Family getFamily_by_name(String name){
        List<Family> family = familyRepository.findAll();

        for (Family f:family ) {
            if (f.getName().equals(name))
                return familyRepository.findById(f.getCode()).get();
        }
        return null;
    }
}
