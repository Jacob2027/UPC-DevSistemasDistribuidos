package com.upc.ventas.negocio;

import com.upc.ventas.entidades.SalesOrder;
import com.upc.ventas.entidades.SalesOrderLine;
import com.upc.ventas.repositorios.SalesOrderRepository;
import com.upc.ventas.repositorios.SalesOrderLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SalesOrderBusiness {
    @Autowired SalesOrderRepository salesOrderRepository;
    @Autowired SalesOrderLineRepository salesOrderLineRepository;

    public SalesOrder createSalesOrder(SalesOrder salesOrder){
        return salesOrderRepository.save(salesOrder);
    }
    public double calculateTotalPrice(Long code){
        double totalPrice = 0;
        List<SalesOrderLine> salesOrderLines =salesOrderLineRepository.findAll();
        for (SalesOrderLine s: salesOrderLines){
            if (s.getSalesOrder().getCode().equals(code)){
                totalPrice = totalPrice + s.getUnitPrice();
            }
        }
        return totalPrice;
    }
    public double calculateTotalIVA(Long code){
        double total = 0;
        double IGV = 0.18;
        List<SalesOrderLine> salesOrderLines =salesOrderLineRepository.findAll();
        for (SalesOrderLine s: salesOrderLines){
            if (s.getSalesOrder().getCode().equals(code))
                total = total + s.getUnitPrice();
        }
        return (total *IGV) +total;
    }
    public List<SalesOrder> getAllSalesOrder(){
        return salesOrderRepository.findAll();
    }
    public List<SalesOrder> getSalesOrder_by_cliente(int documentNumber){
        List<SalesOrder> salesOrders = new ArrayList<>();
        List<SalesOrder> s = salesOrderRepository.findAll();

        for (SalesOrder so: s) {
            if (so.getCustomer().getDocumentNumber()==documentNumber) {
                SalesOrder son = salesOrderRepository.findById(so.getCode()).get();
                salesOrders.add(son);
            }
        }
        return salesOrders;
    }
}
