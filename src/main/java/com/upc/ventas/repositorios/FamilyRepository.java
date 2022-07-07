package com.upc.ventas.repositorios;

import com.upc.ventas.entidades.Family;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepository extends JpaRepository<Family, Long> {
}
