package com.sgh.prontuarioeletronico.util;

public class GeradorRegistro {
    private static Long registro = 1L;

    public static Long geraNumRegistro(){
        return registro++;
    }
}
