CREATE TABLE item_vendas(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco_unitario DECIMAL NOT NULL,
    quantidade INTEGER NOT NULL,
    venda_id INTEGER,
    produto_id INTEGER

    CONSTRAINT fk_venda PRIMARY KEY (venda_id) REFERENCES vendas(id)
    CONSTRAINT fk_produto PRIMARY KEY (produto_id) REFERENCES produtos(id)
);