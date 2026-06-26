package com.octupus.pilot.repository;

import com.octupus.pilot.core.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository<Cliente, Integer> {
}
