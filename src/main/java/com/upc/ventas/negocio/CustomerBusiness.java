package com.upc.ventas.negocio;

import com.upc.ventas.entidades.Customer;
import com.upc.ventas.entidades.Product;
import com.upc.ventas.repositorios.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerBusiness {
    @Autowired
    CustomerRepository customerRepository;
    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public Customer getCustomer_by_documentNumber(int documentNumber){
        return customerRepository.findById(documentNumber).get();
    }
    public Customer getCustomer_by_fullname(String fullname){
            List<Customer> customers = customerRepository.findAll();

            for (Customer c: customers  ) {
                if (c.getFullname().equals(fullname)){
                    return customerRepository.findById(c.getDocumentNumber()).get();
                }
            }
            return null;

    }
}
