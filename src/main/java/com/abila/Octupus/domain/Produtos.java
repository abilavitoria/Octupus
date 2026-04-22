package com.abila.Octupus.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "produtos")
public class Produtos {
    private Integer id;
    private String nome;
    private BigDecimal valor;
    private String tipo;
}
