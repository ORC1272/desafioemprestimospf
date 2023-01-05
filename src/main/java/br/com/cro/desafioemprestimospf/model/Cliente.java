package br.com.cro.desafioemprestimospf.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.UUID;
@Getter
@Setter
@Entity
public class Cliente {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "cliente_id")
    private UUID id;

    @CPF(message = "Número CPF inválido")
    @NotBlank(message = "CPF não informado")
    private String cpf;

    @Email(message = "Email inválido")
    @NotBlank(message = "Email não informado")
    private String email;

    @NotBlank(message = "Nome não informado")
    private String nomeCompleto;

    private String telefone;

    private TipoConta tipoConta;


//    @ManyToOne
//    @JoinColumn(name = "conta_id")
//    private Conta conta;


//    public Cliente(UUID clienteId, String cpf, String email, String nomeCompleto, String telefone, Conta conta) {
//        this.clienteId = clienteId;
//        this.dataCadastro = LocalDateTime.now();
//        this.cpf = cpf;
//        this.email = email;
//        this.nomeCompleto = nomeCompleto;
//        this.telefone = telefone;
//        this.conta = conta;
//    }
}
