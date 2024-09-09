package com.example_hotel.hotel_reservation.controller;

import com.example_hotel.hotel_reservation.dto.CadastroQuartoDTO;
import com.example_hotel.hotel_reservation.dto.NovaReservaDTO;
import com.example_hotel.hotel_reservation.model.Quarto;
import com.example_hotel.hotel_reservation.repository.QuartoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quarto")
public class QuartoController {
    @Autowired
    private QuartoRepository repository;

    @PostMapping
    public ResponseEntity novaRerserva(@RequestBody CadastroQuartoDTO dto){
        Quarto quarto = new Quarto(dto);
        repository.save(quarto);
        return ResponseEntity.ok(dto);
    }

}
