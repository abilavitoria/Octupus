package com.abila.Octupus.domain.dtos;

public record ClienteRequest(
        String nome,
        Integer idade,
        String documento,
        String tipo_conta
) {
}
