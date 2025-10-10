package org.schani.java8.lambda.Tarea;

public class TestProcesadorTexto {
    public static void main(String[] args) {

        Proceso eliminar = a -> a.replaceAll("[ ,.]","").toUpperCase();
        Procesadora p= new Procesadora();

        System.out.println(p.procesador("Maria, estaba desocupada. Me dio un mate",eliminar));
    }
}
