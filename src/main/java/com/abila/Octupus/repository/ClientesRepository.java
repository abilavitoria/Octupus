package com.abila.Octupus.repository;

import com.abila.Octupus.domain.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Integer> {
}
