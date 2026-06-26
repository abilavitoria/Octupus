package com.octupus.pilot.core.usuario.dto;

import com.octupus.pilot.core.usuario.UsuarioRole;
import com.octupus.pilot.core.usuario.UsuarioStatus;

public record UsuarioRequest(
        String email,
        String senha,
        UsuarioStatus status,
        UsuarioRole role
) {
}
