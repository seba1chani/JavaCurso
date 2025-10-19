package org.schani.api.stream.Tarea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;

public class TestCalcularImporteSum {
    public static void main(String[] args) {

        List<Producto>lista= new ArrayList<>();
        lista.add(new Producto(10,5));
        lista.add(new Producto(5,20));
        lista.add(new Producto(15,10));

        DoubleStream prod= lista.stream()
                .mapToDouble(Producto::getImporte);

        DoubleSummaryStatistics stats= prod.summaryStatistics();
        System.out.println("El importe total: " + stats.getSum());

        //resuluciones Profesor

       /* List<Producto> facturas = Arrays.asList(new Producto(9.99, 1), new Producto(19.99, 1.5),
                new Producto(4.99, 2));
        double sum = facturas.stream()
                .map(p -> p.getCantidad() * p.getPrecio())
                .reduce(0d, Double::sum);
        System.out.println(sum);*/

       /* List<Producto> facturas = Arrays.asList(new Producto(9.99, 1), new Producto(19.99, 1.5),
        new Producto(4.99, 2));

        double sum = facturas.stream()
                .mapToDouble(x -> x.getCantidad() * x.getPrecio())
                .sum();

        System.out.println(sum);*/

    }

}
