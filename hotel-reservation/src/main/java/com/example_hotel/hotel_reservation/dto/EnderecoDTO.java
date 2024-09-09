package com.example_hotel.hotel_reservation.dto;

public record EnderecoDTO (String logradouro,
         String numero,
         String complemento,
         String bairro,
         String cidade,
         String estado,
         String cep) {
}
