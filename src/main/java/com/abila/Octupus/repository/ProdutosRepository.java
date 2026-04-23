package com.abila.Octupus.repository;

import com.abila.Octupus.domain.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer> {
}
