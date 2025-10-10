package org.schani.java8.lambda.Tarea;

public class Procesadora {
    public String procesador(String txt, Proceso p){
        return p.procesar(txt);
    }
}
