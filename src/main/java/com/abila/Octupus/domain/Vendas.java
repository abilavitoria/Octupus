package com.abila.Octupus.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "vendas")
public class Vendas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100)
    private String descricao;
    @Column(nullable = false)
    private BigDecimal valorTotal;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "vendas_id")
    private List<ItemVendas> itemVendas;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Clientes cliente;
}
