package com.abila.Octupus.domain.dtos;

import com.abila.Octupus.domain.Admins;

public record AdminResponse(
        Integer id,
        String nome,
        Integer idade,
        String documento,
        String cargo
) {
    public AdminResponse(Admins admins){
        this(
                admins.getId(),
                admins.getNome(),
                admins.getIdade(),
                admins.getDocumento(),
                admins.getCargo()
        );
    }
}
