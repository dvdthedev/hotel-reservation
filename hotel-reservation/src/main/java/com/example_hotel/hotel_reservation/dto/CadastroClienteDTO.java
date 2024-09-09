package com.example_hotel.hotel_reservation.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record CadastroClienteDTO(
        @NotBlank
        String nome,
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        String documento,
        @NotBlank
        Date data_nascimento,

        EnderecoDTO endereco) {
}
