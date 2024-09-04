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
public class CheckIn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_checkin;
    private Date data_checkin;
    private String status_checkin;

    @ManyToOne
    @JoinColumn(name = "id_reserva")
    private Reserva reserva;
}
