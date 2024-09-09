package com.example_hotel.hotel_reservation.controller;

import com.example_hotel.hotel_reservation.dto.CadastroClienteDTO;
import com.example_hotel.hotel_reservation.repository.ClienteRepository;
import com.example_hotel.hotel_reservation.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")

public class ClienteController {
    @Autowired
    private ClienteRepository repository;
    @Autowired
    ClienteService clienteService;

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody CadastroClienteDTO dto){
        clienteService.cadastrar(dto);
        return ResponseEntity.ok(dto);
    }
}
