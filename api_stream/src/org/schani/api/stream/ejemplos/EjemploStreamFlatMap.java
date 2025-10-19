package org.schani.api.stream.ejemplos;

import org.schani.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres= Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre-> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .flatMap(u-> {
                    if(u.getNombre().equalsIgnoreCase("Pepe")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);


        //nombres.forEach(System.out::println);
        System.out.println(nombres.count());

    }
}
