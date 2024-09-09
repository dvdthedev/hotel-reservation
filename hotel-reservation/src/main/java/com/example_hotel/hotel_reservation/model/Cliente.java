package com.example_hotel.hotel_reservation.model;

import com.example_hotel.hotel_reservation.dto.CadastroClienteDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
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
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    public Cliente(CadastroClienteDTO dto) {
        this.nome = dto.nome();
        this.email = dto.email();
        this.telefone = dto.telefone();
        this.documento = dto.documento();
        this.data_nascimento = dto.data_nascimento();
        this.data_criacao = Timestamp.valueOf(LocalDateTime.now());
        this.endereco = new Endereco(dto.endereco());
    }
}