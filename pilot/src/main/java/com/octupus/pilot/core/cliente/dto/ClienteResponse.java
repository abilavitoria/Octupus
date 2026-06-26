package com.octupus.pilot.core.cliente.dto;

import com.octupus.pilot.core.cliente.Cliente;
import com.octupus.pilot.core.usuario.Usuario;

public record ClienteResponse(
        String nome,
        Integer idade,
        String email,
        String profissao,
        String documento,
        Usuario usuario
) {
    public ClienteResponse(Cliente cliente){
        this(
                cliente.getNome(),
                cliente.getIdade(),
                cliente.getEmail(),
                cliente.getProfissao(),
                cliente.getDocumento(),
                cliente.getUsuario()
        );
    }
}
