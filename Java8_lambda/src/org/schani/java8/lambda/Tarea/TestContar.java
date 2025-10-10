package org.schani.java8.lambda.Tarea;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestContar {
    public static void main(String[] args) {
        ContadorPalabras contar= frase->{
            Map<String,Integer> frecuencia= new HashMap<>();
            String palabraMayus= frase.toUpperCase();
            String[]palabras= palabraMayus.split("[^a-zA-ZáéíóúÁÉÍÓÚñÑüÜ0-9]+");
            for(String palabra: palabras){
                if(!palabra.isEmpty()){
                    frecuencia.put(palabra,frecuencia.getOrDefault(palabra,0)+1);
                }
            }

            Map.Entry<String, Integer> maxEntry = Collections.max(
                    frecuencia.entrySet(),
                    Map.Entry.comparingByValue()
            );

            Map<String, Integer> resultado = new HashMap<>();
            resultado.put(maxEntry.getKey(), maxEntry.getValue());

            return resultado;
        };

        String testFrase= "Hello world hello Java";
        System.out.println(testFrase);
        System.out.println("Palabra mas repetida: "+ contar.contar(testFrase));
    }
}
