package org.schani.api.stream.Tarea;

import java.util.Arrays;
import java.util.stream.Stream;

public class AplanarArreglo {
    public static void main(String[] args) {

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"}, {"javascript"}, {}};

       /* Stream<String>streamPlano= Arrays.stream(lenguajes)
                .flatMap(Arrays::stream)
                .filter(n-> !n.isEmpty())
                .distinct();

        streamPlano.forEach(System.out::println);
    */

        //Ejemplo profesor
        Arrays.stream(lenguajes)
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);

    }
}
