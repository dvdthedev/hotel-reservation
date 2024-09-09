package com.example_hotel.hotel_reservation.dto;

import java.util.Date;

public record NovaReservaDTO(Long id_reserva,
                             Long id_cliente,
                             Long id_quarto,
                             Date data_checkin,
                             Date data_checkout,
                             String status_reserva,
                             Date data_criacao) {
}


/*
    private Long id_reserva;

    @Column(name = "id_cliente")
    private Long id_cliente;

    @Column(name = "id_quarto")
    private Long id_quarto;

    @Column(name = "data_checkin")
    @Temporal(TemporalType.DATE)
    private Date data_checkin;

    @Column(name = "data_checkout")
    @Temporal(TemporalType.DATE)
    private Date data_checkout;

    @Column(name = "status_reserva", length = 20)
    private String status_reserva;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_criacao;
 */