package br.com.cro.desafioemprestimospf.dto;
import br.com.cro.desafioemprestimospf.model.Conta;
import br.com.cro.desafioemprestimospf.model.TipoConta;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Data
public class ClienteDto {


    private UUID id;
    private String cpf;
    private String email;
    private String nomeCompleto;
    private String telefone;
    private TipoConta tipoConta;
    private Conta conta;



}
