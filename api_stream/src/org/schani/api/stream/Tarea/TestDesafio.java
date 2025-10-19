package org.schani.api.stream.Tarea;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestDesafio {
    public static void main(String[] args) {
/*
        int[] arr = new int[100];
        for(int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }

        double numerosReducidos= Arrays.stream(arr)
                .filter(num->num % 10!=0)
                .mapToDouble(n->(double) n/2.0)
                .peek(System.out::println)
                .reduce(0, Double::sum);

        System.out.println("Resultado = " + numerosReducidos);

        */

        Integer[]num= {45, 12, 89, 3, 67, 34, 91, 23, 78, 5};

       /* Function<int[],Integer>encontarMayor= arr->
                Arrays.stream(arr)
                        .reduce(Integer.MIN_VALUE,Integer::max);
        int mayor= encontarMayor.apply(num);
        System.out.println("El mayor numero es: "+ mayor);
        */
        Function<Integer[],Integer> max = arr->
                Arrays.stream(arr)
                        .reduce(0,(ac,e)->ac > e? ac:e);
        
        int resultado = max.apply(num);
        System.out.println("resultado = " + resultado);
    }

}
