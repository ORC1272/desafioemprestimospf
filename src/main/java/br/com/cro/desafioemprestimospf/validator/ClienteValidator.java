package br.com.cro.desafioemprestimospf.validator;

import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class ClienteValidator {

    public int validate (int id) throws ClienteValidationException{
        if(id == -1){
            throw new ClienteValidationException("Valor invalido");
        }
        return id;
    }
}
