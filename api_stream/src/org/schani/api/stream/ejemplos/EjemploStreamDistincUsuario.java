package org.schani.api.stream.ejemplos;

import org.schani.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistincUsuario {
    public static void main(String[] args) {

        Stream<Usuario> nombres= Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia","Pato Guzman")

                .map(nombre-> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct();


        nombres.forEach(System.out::println);
    }
}
