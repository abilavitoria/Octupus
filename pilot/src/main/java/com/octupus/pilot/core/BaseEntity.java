package com.octupus.pilot.core;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreatedDate
    @Column(name = "data_criacao", updatable = false)
    private LocalDateTime dataCriacao;

    @LastModifiedBy
    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    @CreatedDate
    @Column(name = "criado_por", updatable = false)
    private String criadoPor;

    @LastModifiedBy
    @Column(name = "atualizado_por")
    private String atualizadoPor;
}
