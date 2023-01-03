package br.com.cro.desafioemprestimospf.validator;

import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class ClienteValidator {

    public int validate (int clienteId) throws ClienteValidationException{
        if(clienteId == -1){
            throw new ClienteValidationException("Valor invalido");
        }
        return clienteId;
    }
}
