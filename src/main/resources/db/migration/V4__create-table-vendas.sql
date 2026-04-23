CREATE TABLE vendas(
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(100),
    valor_total DECIMAL NOT NULL,
    cliente_id INTEGER

    CONSTRAINT fk_clientes FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);