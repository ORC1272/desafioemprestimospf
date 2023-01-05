package br.com.cro.desafioemprestimospf.dto;


import br.com.cro.desafioemprestimospf.model.Cliente;
import br.com.cro.desafioemprestimospf.model.SegmentoConta;
import br.com.cro.desafioemprestimospf.model.TipoBloqueio;
import br.com.cro.desafioemprestimospf.model.TipoLimite;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Data
public class ContaDto {


    private UUID contaId;
     private String agenciaNumero;
    private String numeroContaSemDigito;
    private String numeroDigitoConta;
    private SegmentoConta segmentoConta;
    private TipoLimite tipoLimite;
    private TipoBloqueio tipoBloqueio;
    private Cliente cliente;

}
