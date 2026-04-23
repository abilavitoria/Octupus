package com.abila.Octupus.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(nullable = false)
    private Integer idade;
    @Column(length = 14, nullable = false, unique = true)
    private String documento;
    @Column(length = 100)
    private String cargo;


}
