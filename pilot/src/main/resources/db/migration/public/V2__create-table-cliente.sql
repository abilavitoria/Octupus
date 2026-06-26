CREATE TABLE IF NOT EXISTS public.cliente(
    id SERIAL PRIMARY KEY,
    id_usuario INT NOT NULL,
    tenantId TEXT NOT NULL,
    nome VARCHAR(150) NOT NULL,
    idade INTEGER NOT NULL,
    email VARCHAR(150) NOT NULL,
    profissao VARCHAR(150) NOT NULL,
    documento VARCHAR(20) NOT NULL,
    data_criacao TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    data_atualizacao TIMESTAMP WITHOUT TIME ZONE,
    criado_por VARCHAR(255) DEFAULT 'SYSTEM',
    atualizado_por VARCHAR(255)
);