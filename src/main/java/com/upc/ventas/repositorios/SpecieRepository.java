package com.upc.ventas.repositorios;

import com.upc.ventas.entidades.Specie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecieRepository extends JpaRepository<Specie, Long> {
}
