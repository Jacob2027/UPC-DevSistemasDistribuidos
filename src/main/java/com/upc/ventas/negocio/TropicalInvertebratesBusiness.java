package com.upc.ventas.negocio;

import com.upc.ventas.entidades.Specie;
import com.upc.ventas.repositorios.SpecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TropicalInvertebratesBusiness {
    @Autowired
    SpecieRepository specieRepository;

    public Specie createSpecie(Specie specie){
        return specieRepository.save(specie);
    }
    public List<Specie> getAllSpecie(){
        return specieRepository.findAll();
    }
    public Specie getSpecie_by_code(Long code){
        return specieRepository.findById(code).get();
    }
    public Specie getSpecie_by_name(String name){
        List<Specie> specie = specieRepository.findAll();
        Specie newSpecie = null;
        for (Specie s:specie ) {
            if (s.getName()==name){
                newSpecie = specieRepository.findById(s.getCode()).get();
            }
        }
        return newSpecie;
    }
}
