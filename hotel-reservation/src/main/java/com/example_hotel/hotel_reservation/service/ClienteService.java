package com.example_hotel.hotel_reservation.service;

import com.example_hotel.hotel_reservation.dto.CadastroClienteDTO;
import com.example_hotel.hotel_reservation.model.Cliente;
import com.example_hotel.hotel_reservation.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente cadastrar(CadastroClienteDTO dto) {
         Cliente cliente = new Cliente(dto);
         repository.save(cliente);

    return cliente;
    }
}
