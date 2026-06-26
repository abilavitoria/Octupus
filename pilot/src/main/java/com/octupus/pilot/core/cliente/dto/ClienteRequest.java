package com.octupus.pilot.core.cliente.dto;

public record ClienteRequest(
        String nome,
        Integer idade,
        String email,
        String profissao,
        String documento
) {
}
