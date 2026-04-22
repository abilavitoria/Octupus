package com.abila.Octupus.domain.dtos;

import com.abila.Octupus.domain.Produtos;

import java.math.BigDecimal;

public record ProdutoResponse(
        Integer id,
        String nome,
        BigDecimal valor,
        String tipo
) {
    public ProdutoResponse(Produtos produtos){
        this(
                produtos.getId(),
                produtos.getNome(),
                produtos.getValor(),
                produtos.getTipo()
        );
    }
}
