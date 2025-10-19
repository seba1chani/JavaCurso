package org.schani.java8.lambda.EjemploProfesor;

import java.util.Map;

@FunctionalInterface
public interface ContadorPalabras {
    Map<String,Integer> contarPalabras(String frase);
}
