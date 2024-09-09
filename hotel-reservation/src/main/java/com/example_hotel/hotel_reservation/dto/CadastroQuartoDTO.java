package com.example_hotel.hotel_reservation.dto;

public record CadastroQuartoDTO(
        String numero_quarto,
         String tipo_quarto,
         int capacidade,
         float preco_diaria
) {
}
