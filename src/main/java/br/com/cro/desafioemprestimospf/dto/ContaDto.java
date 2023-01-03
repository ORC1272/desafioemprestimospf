package br.com.cro.desafioemprestimospf.dto;

import lombok.Data;
import java.time.Instant;
import java.util.UUID;

@Data
public class ContaDto {


    private UUID contaId;
    private Instant dataCadastro;
    private String agenciaNumero;
    private String numeroContaSemDigito;
    private String numeroDigitoConta;
}
