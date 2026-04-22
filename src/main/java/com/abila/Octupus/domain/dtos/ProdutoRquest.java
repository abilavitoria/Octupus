package com.abila.Octupus.domain.dtos;

import java.math.BigDecimal;

public record ProdutoRquest(
        String nome,
        BigDecimal valor,
        String tipo
) {
}
