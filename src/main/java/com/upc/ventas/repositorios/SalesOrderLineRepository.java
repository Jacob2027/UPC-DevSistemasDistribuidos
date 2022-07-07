package com.upc.ventas.repositorios;

import com.upc.ventas.entidades.SalesOrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOrderLineRepository extends JpaRepository<SalesOrderLine,Long> {
}
