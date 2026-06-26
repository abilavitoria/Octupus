package com.octupus.pilot.core.usuario.dto;

import com.octupus.pilot.core.usuario.Usuario;
import com.octupus.pilot.core.usuario.UsuarioRole;
import com.octupus.pilot.core.usuario.UsuarioStatus;

public record UsuarioResponse(
        String email,
        String senha,
        UsuarioStatus status,
        UsuarioRole role,
        String tenant_id
) {
    public UsuarioResponse(Usuario usuario){
        this(
                usuario.getEmail(),
                usuario.getSenha(),
                usuario.getStatus(),
                usuario.getRole(),
                usuario.getTenant_id()
        );
    }
}
