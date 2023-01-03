package br.com.cro.desafioemprestimospf.model;

import lombok.Getter;

@Getter
public enum TipoBloqueio {
    SEM_BLOQUEIO(1),
    CONTA_BLOQUEADA(2);

    private int code;

    private TipoBloqueio(int code){
        this.code = code;
        }


    public static TipoBloqueio valueOf(int code) {
        for (TipoBloqueio value : TipoBloqueio.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("O segmento da conta é invalido");
    }
}
