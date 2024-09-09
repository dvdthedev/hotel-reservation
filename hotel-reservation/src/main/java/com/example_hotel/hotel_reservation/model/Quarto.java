package com.example_hotel.hotel_reservation.model;

import com.example_hotel.hotel_reservation.dto.CadastroQuartoDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "quartos")
public class Quarto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_quarto;
    private String numero_quarto;
    private String tipo_quarto;
    private int capacidade;
    private float preco_diaria;

    public Quarto(CadastroQuartoDTO dto) {
        this.numero_quarto = dto.numero_quarto();
        this.tipo_quarto = dto.tipo_quarto();
        this.capacidade = dto.capacidade();
        this.preco_diaria = dto.preco_diaria();
    }
}
