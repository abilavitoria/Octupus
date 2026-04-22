package com.abila.Octupus.domain.dtos;

public record AdminRequest(
        String nome,
        Integer idade,
        String documento,
        String cargo
) {
}
