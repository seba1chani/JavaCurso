package org.schani.api.stream.ejemplos;

import org.schani.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {

        Usuario usuario= Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre-> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u->u.getId().equals(2))
                .findFirst().orElseGet(()-> new Usuario("Jhon","Doe"));


         System.out.println(usuario);

        //nombres.forEach(System.out::println);

    }
}
