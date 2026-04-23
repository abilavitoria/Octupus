package com.abila.Octupus.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "item_vendas")
public class ItemVendas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(nullable = false)
    private BigDecimal precoUnitario;
    @Column(nullable = false)
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "id_venda")
    private Vendas venda;
    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produtos produto;
}
