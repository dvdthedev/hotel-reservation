CREATE TABLE quartos (
    id_quarto BIGINT AUTO_INCREMENT PRIMARY KEY,
    numero_quarto VARCHAR(10) NOT NULL UNIQUE,
    tipo_quarto VARCHAR(50) NOT NULL, -- Ex: "Standard", "Deluxe"
    capacidade INT NOT NULL,
    preco_diaria DECIMAL(10, 2) NOT NULL
);
CREATE TABLE reservas (
    id_reserva BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_cliente BIGINT NOT NULL,
    id_quarto BIGINT NOT NULL,
    data_checkin DATE NOT NULL,
    data_checkout DATE NOT NULL,
    status_reserva VARCHAR(20) NOT NULL, -- Ex: "Reservado", "Concluído", "Cancelado"
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
    FOREIGN KEY (id_quarto) REFERENCES quartos(id_quarto)
);
CREATE TABLE checkins (
    id_checkin BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_reserva BIGINT NOT NULL,
    data_checkin DATETIME NOT NULL,
    status_checkin VARCHAR(20) NOT NULL, -- Ex: "Pendente", "Efetuado"
    FOREIGN KEY (id_reserva) REFERENCES reservas(id_reserva)
);
CREATE TABLE checkouts (
    id_checkout BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_reserva BIGINT NOT NULL,
    data_checkout DATETIME NOT NULL,
    status_checkout VARCHAR(20) NOT NULL, -- Ex: "Pendente", "Efetuado"
    FOREIGN KEY (id_reserva) REFERENCES reservas(id_reserva)
);