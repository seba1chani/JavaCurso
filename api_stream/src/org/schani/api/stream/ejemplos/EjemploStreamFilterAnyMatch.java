package org.schani.api.stream.ejemplos;

import org.schani.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

        Boolean existe= Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre-> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u->u.getId().equals(1));



         System.out.println(existe);

        //nombres.forEach(System.out::println);

    }
}
