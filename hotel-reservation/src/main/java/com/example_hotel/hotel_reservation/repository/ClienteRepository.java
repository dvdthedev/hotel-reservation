package com.example_hotel.hotel_reservation.repository;

import com.example_hotel.hotel_reservation.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
