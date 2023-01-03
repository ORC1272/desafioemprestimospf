package br.com.cro.desafioemprestimospf.exceptions;

public class ItemNotExistsException extends RuntimeException{
    public ItemNotExistsException(String message) {
        super(message);
    }
}
