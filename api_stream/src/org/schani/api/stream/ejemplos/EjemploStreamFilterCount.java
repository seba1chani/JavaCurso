package org.schani.api.stream.ejemplos;

import org.schani.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {
    public static void main(String[] args) {

        long count= Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre-> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();



         System.out.println(count);

        //nombres.forEach(System.out::println);

    }
}
