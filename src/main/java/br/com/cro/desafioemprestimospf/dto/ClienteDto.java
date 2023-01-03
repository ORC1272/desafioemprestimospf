package br.com.cro.desafioemprestimospf.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ClienteDto {


    private UUID clienteId;
    private LocalDateTime dataCadastro;
    private String cpf;
    private String email;
    private String nomeCompleto;
    private String telefone;



}
