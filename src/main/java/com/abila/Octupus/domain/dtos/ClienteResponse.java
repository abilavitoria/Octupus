package com.abila.Octupus.domain.dtos;

import com.abila.Octupus.domain.Clientes;

public record ClienteResponse(
        Integer id,
        String nome,
        Integer idade,
        String documento,
        String tipo_conta
) {
    public ClienteResponse(Clientes clientes){
        this(
                clientes.getId(),
                clientes.getNome(),
                clientes.getIdade(),
                clientes.getDocumento(),
                clientes.getTipo_conta()
        );
    }
}
