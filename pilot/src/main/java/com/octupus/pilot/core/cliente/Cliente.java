package com.octupus.pilot.core.cliente;


import com.octupus.pilot.core.BaseEntity;
import com.octupus.pilot.core.usuario.Usuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Cliente extends BaseEntity {

    @OneToOne(optional = false)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Formula("(SELECT u.tenant_id FROM usuario u WHERE u.id = id_usuario)")
    private String tenant_id;

    @Column(length = 150, nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer idade;

    @Column(length = 150 ,nullable = false)
    private String email;

    @Column(length = 150)
    private String profissao;

    @Column(length = 20, nullable = false)
    private String documento;
}
