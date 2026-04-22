package com.abila.Octupus.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "clientes")
public class Clientes {
    @Id
    private Integer id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 3, nullable = false)
    private Integer idade;
    @Column(length = 14, nullable = false)
    private String documento;
    @Column(length = 100)
    private String tipo_conta;

    @OneToMany
    private List<Vendas> vendas;
}
