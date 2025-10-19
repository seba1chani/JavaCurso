package org.schani.api.stream.ejemplos;

import org.schani.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
    public static void main(String[] args) {


        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andres","Guzman"));
        lista.add(new Usuario("Luci","Martinez"));
        lista.add(new Usuario("Pepe","Fernandez"));
        lista.add(new Usuario("Cata","Perez"));
        lista.add(new Usuario("Lalo","Mena"));
        lista.add(new Usuario("Exequiel","Doe"));
        lista.add(new Usuario("Bruce","Lee"));
        lista.add(new Usuario("Bruce","Wills"));

        long t1= System.currentTimeMillis();
        String resultado= lista.stream()
                .parallel()
                .map(u-> u.toString().toUpperCase())
                .peek(n->{
                    System.out.println("Nombre thread: " + Thread.currentThread().getName()
                    +" - "+n);
                })
                .flatMap(nombre->{
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if(nombre.contains("bruce".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                        .findAny().orElse("");

        long t2= System.currentTimeMillis();
        System.out.println("Tiempo total: "+(t2-t1));
        System.out.println(resultado);
    }
}
