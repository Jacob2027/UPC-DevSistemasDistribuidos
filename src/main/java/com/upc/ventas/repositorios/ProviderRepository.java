package com.upc.ventas.repositorios;

import com.upc.ventas.entidades.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
