package com.octupus.pilot.core.admin;

import com.octupus.pilot.core.BaseEntity;
import com.octupus.pilot.core.usuario.Usuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Admin extends BaseEntity {

    @OneToOne(optional = false)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(length = 150, nullable = false)
    private String nome;

    @Column(length = 20, nullable = false)
    private String documento;

    @Column(length = 150, nullable = false)
    private String email;

    @Column(length = 150, nullable = false)
    private String cargo;
}
