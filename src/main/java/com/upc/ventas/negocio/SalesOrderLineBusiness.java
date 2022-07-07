package com.upc.ventas.negocio;

import com.upc.ventas.entidades.SalesOrder;
import com.upc.ventas.entidades.SalesOrderLine;
import com.upc.ventas.repositorios.SalesOrderLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesOrderLineBusiness {
    @Autowired
    SalesOrderLineRepository salesOrderLineRepository;

    public SalesOrderLine createSalesOrderLine(SalesOrderLine salesOrderLine){
        return salesOrderLineRepository.save(salesOrderLine);
    }
    public SalesOrderLine getSalesOrderLine_by_code(Long code){
        return salesOrderLineRepository.findById(code).get();
    }
}
