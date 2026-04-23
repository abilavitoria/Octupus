package com.abila.Octupus.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "produtos")
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(nullable = false)
    private BigDecimal valor;
    @Column(length = 100, nullable = false)
    private String tipo;
    @Column(nullable = false)
    private Integer quantidade;

    @OneToMany
    @JoinColumn(name = "produto_id")
    private ItemVendas itemVendas;
}
