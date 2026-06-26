package com.octupus.pilot.core.admin.dto;

import com.octupus.pilot.core.admin.Admin;
import com.octupus.pilot.core.usuario.Usuario;

public record AdminResponse(
        String nome,
        String documento,
        String email,
        String cargo,
        Usuario usuario
) {
    public AdminResponse(Admin admin){
        this(
                admin.getNome(),
                admin.getDocumento(),
                admin.getEmail(),
                admin.getCargo(),
                admin.getUsuario()
        );
    }
}
