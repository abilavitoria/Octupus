CREATE TABLE clientes(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INTEGER NOT NULL,
    documento VARCHAR(14) NOT NULL,
    tipo_conta VARCHAR(100),

);