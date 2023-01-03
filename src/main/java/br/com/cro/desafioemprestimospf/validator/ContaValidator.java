package br.com.cro.desafioemprestimospf.validator;

import org.springframework.stereotype.Component;

@Component
public class ContaValidator {

    public int validate (int contaId) throws ContaValidationException{
        if(contaId == -1){
            throw new ContaValidationException("Valor invalido");
        }
        return contaId;
    }
}
