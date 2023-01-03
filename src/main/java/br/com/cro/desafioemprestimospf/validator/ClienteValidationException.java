package br.com.cro.desafioemprestimospf.validator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ClienteValidationException extends RuntimeException{
    public ClienteValidationException(String message){
        super(message);
    }
}
