package br.com.cro.desafioemprestimospf.dto;

import br.com.cro.desafioemprestimospf.model.SegmentoConta;
import br.com.cro.desafioemprestimospf.model.TipoBloqueio;
import br.com.cro.desafioemprestimospf.model.TipoLimite;
import lombok.Data;
import java.time.Instant;
import java.util.UUID;

@Data
public class ContaDto {


    private UUID contaId;
     private String agenciaNumero;
    private String numeroContaSemDigito;
    private String numeroDigitoConta;
    private SegmentoConta segmentoConta;
    private TipoLimite tipoLimite;
    private TipoBloqueio tipoBloqueio;

}
