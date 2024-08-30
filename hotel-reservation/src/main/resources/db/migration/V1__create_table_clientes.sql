CREATE TABLE enderecos (
    id_endereco BIGINT AUTO_INCREMENT PRIMARY KEY,
    logradouro VARCHAR(100) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    complemento VARCHAR(50),
    bairro VARCHAR(50) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    estado VARCHAR(2) NOT NULL, -- Ex: "MG"
    cep VARCHAR(10) NOT NULL
);


CREATE TABLE clientes (
    id_cliente BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    telefone VARCHAR(15),
    documento VARCHAR(20) NOT NULL UNIQUE, -- CPF ou RG
    data_nascimento DATE,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    id_endereco BIGINT,
    FOREIGN KEY (id_endereco) REFERENCES enderecos(id_endereco)
);

