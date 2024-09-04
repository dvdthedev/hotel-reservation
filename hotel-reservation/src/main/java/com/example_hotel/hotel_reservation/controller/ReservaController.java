package com.example_hotel.hotel_reservation.controller;

import com.example_hotel.hotel_reservation.dto.NovaReservaDTO;
import com.example_hotel.hotel_reservation.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reserva")

public class ReservaController {

    @Autowired
    private ReservaRepository repository;

    @PostMapping
    public ResponseEntity novaRerserva(@RequestBody NovaReservaDTO dto){
        System.out.println(dto);
        return ResponseEntity.ok(dto);
    }

}
