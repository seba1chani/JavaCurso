package org.schani.ejemplos.set;

import org.schani.ejemplos.modelos.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno>sa= new HashSet<>();
        //List<Alumno>sa= new LinkedList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andre",3));
        sa.add(new Alumno("Zeus",3));
        sa.add(new Alumno("Zeus",2));
        System.out.println(sa);

        /*System.out.println("Iterando usando un for normal");
        for(int i=0;i<sa.size();i++){
            Alumno a= sa.get(i);
            System.out.println(a.getNombre());
        }*/

        System.out.println("Usando un foreach ");
        for (Alumno alumno:sa){
            System.out.println(alumno);
        }

        System.out.println("Iterando usando While y Iterator");
        Iterator<Alumno>it= sa.iterator();
        while(it.hasNext()){
            Alumno a= it.next();
            System.out.println(a);
        }
        System.out.println("Iterando usando Streams foreach");
        //sa.forEach(alumno -> System.out.println(alumno.getNombre()));
        sa.forEach(System.out::println);

    }
}
