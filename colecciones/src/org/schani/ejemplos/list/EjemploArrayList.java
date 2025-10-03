package org.schani.ejemplos.list;

import org.schani.ejemplos.modelos.Alumno;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> al = new ArrayList<>();
        System.out.println(al+"tamanio: "+al.size());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(new Alumno("Jano", 7));
        al.add(new Alumno("Andre", 3));
        System.out.println(al+"tamanio: "+al.size());
        al.remove(new Alumno("Jano",7));
        System.out.println(al+"tamanio: "+al.size());
        //al.remove(0);
        boolean b= al.contains(new Alumno("Jano",7));
        System.out.println("La lista contiene= "+ b);

        Object a[]= al.toArray();
        for (int i = 0; i <a.length ; i++) {
            System.out.println("Desde el arreglo= "+ a[i]);

        }

    }
}
