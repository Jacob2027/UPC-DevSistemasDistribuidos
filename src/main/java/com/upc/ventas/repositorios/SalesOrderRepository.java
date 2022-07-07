package com.upc.ventas.repositorios;

import com.upc.ventas.entidades.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, Long> {
}
