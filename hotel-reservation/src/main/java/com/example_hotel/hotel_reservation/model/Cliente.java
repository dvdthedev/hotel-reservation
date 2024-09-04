package com.example_hotel.hotel_reservation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name = "clientes")
@Entity(name = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_cliente;
    private String nome;
    private String email;
    private String telefone;
    private String documento;
    private Date data_nascimento;
    private Date data_criacao;
    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

}