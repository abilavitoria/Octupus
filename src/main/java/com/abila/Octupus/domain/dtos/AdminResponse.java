package com.abila.Octupus.domain.dtos;

import com.abila.Octupus.domain.Admin;

public record AdminResponse(
        Integer id,
        String nome,
        Integer idade,
        String documento,
        String cargo
) {
    public AdminResponse(Admin admin){
        this(
                admin.getId(),
                admin.getNome(),
                admin.getIdade(),
                admin.getDocumento(),
                admin.getCargo()
        );
    }
}
