package com.example_hotel.hotel_reservation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
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
}
