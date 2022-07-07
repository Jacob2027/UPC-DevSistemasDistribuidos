package com.upc.ventas.negocio;
import com.upc.ventas.entidades.Specie;
import com.upc.ventas.repositorios.SpecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecieBusiness {
    @Autowired SpecieRepository specieRepository;

    //Specie class functions
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
        List<Specie> species = specieRepository.findAll();
        for (Specie s:species ) {
            if (s.getName().equals(name))
                return specieRepository.findById(s.getCode()).get();
        }
        return null;
    }

}
