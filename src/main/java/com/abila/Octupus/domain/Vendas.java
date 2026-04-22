package com.abila.Octupus.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "vendas")
public class Vendas {
    private Integer id;
    private String descricao;
    private BigDecimal valorTotal;

    private List<ItemVendas> itemVendas;

    @ManyToOne
    private Clientes id_cliente;
}
