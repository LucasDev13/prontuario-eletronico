package com.sgh.prontuarioeletronico.util;

public class GeradorProntuario {
    private static Long prontuario = 9L;

    public static Long geraNumProntuario(){
        return prontuario++;
    }
}
