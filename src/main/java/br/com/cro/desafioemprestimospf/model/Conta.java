package br.com.cro.desafioemprestimospf.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Conta {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "conta_id")
    private UUID contaId;

    private Instant dataCadastro;
    private String agenciaNumero;

    @NotBlank(message = "Número da conta não informado")
    private String numeroContaSemDigito;

    @NotBlank(message = "Digito da conta não informado")
    private String numeroDigitoConta;

//    @ManyToOne
//    @JoinColumn(name = "tipo_conta_id")
//    @NotNull
//    private TipoConta tipoConta;
//
//    @OneToMany
//    @JoinColumn(name = "cliente_id")
//    @NotNull
//    private Cliente cliente;
//
//    public Conta(){};
}
