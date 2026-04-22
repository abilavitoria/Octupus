package com.abila.Octupus.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "admins")
public class Admins {
    @Id
    private Integer id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 3, nullable = false)
    private Integer idade;
    @Column(length = 14, nullable = false)
    private String documento;
    @Column(length = 100)
    private String cargo;
}
