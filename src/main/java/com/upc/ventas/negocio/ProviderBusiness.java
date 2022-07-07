package com.upc.ventas.negocio;

import com.upc.ventas.entidades.Family;
import com.upc.ventas.entidades.Provider;
import com.upc.ventas.repositorios.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderBusiness {
    @Autowired
    ProviderRepository providerRepository;

    public Provider createProvider(Provider provider){
        return providerRepository.save(provider);
    }
    public List<Provider> getAllProvider(){
        return providerRepository.findAll();
    }

}
