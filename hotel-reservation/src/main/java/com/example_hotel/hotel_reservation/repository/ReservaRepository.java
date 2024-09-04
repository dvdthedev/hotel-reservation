package com.example_hotel.hotel_reservation.repository;

import com.example_hotel.hotel_reservation.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
