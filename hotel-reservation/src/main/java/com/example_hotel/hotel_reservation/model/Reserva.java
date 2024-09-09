package com.example_hotel.hotel_reservation.model;

import com.example_hotel.hotel_reservation.dto.NovaReservaDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
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

    public Reserva(NovaReservaDTO dto) {
        this.id_cliente = dto.id_cliente();
        this.id_quarto = dto.id_quarto();
        this.data_checkin = dto.data_checkin();
        this.data_checkout  = dto.data_checkout();
        this.status_reserva = dto.status_reserva();
        this.data_criacao = Date.from(Instant.now());
    }
}
