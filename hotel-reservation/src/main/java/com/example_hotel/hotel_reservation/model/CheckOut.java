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
public class CheckOut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_checkout;
    private Date data_checkout;
    private String status_checkout;

    @ManyToOne
    @JoinColumn(name = "id_reserva")
    private Reserva reserva;
}
