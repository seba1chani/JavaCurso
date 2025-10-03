package org.schani.ejemplos.list;

import org.schani.ejemplos.modelos.Alumno;

import java.util.LinkedList;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada+"tamanio: "+enlazada.size());
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andre", 3));

        System.out.println(enlazada+" tamanio: "+enlazada.size());

        enlazada.addFirst(new Alumno("Zeus",5));
        enlazada.addLast(new Alumno("Atenea",6));

        System.out.println(enlazada+" tamanio: "+enlazada.size());
        System.out.println("primero= "+ enlazada.getFirst());
        System.out.println("ultimo= "+ enlazada.getLast());
        System.out.println("Indice en 2"+ enlazada.get(2));

        //Alumno zeus= enlazada.pop();
       // enlazada.pollLast();
        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada+"tamanio: "+enlazada.size());

        enlazada.remove(new Alumno("Jano",7));
        System.out.println(enlazada+"tamanio: "+enlazada.size());

        Alumno a= new Alumno("Lucas",5);
        enlazada.addLast(a);

        enlazada.remove(2);
        System.out.println(enlazada+"tamanio: "+enlazada.size());
        System.out.println("El indice de Lucas= "+ enlazada.indexOf(a));

        enlazada.set(2,new Alumno("Lalo",7));
        System.out.println(enlazada+"tamanio: "+enlazada.size());

        ListIterator<Alumno>li= enlazada.listIterator();

        while(li.hasNext()){
            Alumno alumno= li.next();
            System.out.println(alumno);
        }
        System.out.println("===================Previous");
        while(li.hasPrevious()){
            Alumno alumno= li.previous();
            System.out.println(alumno);
        }


    }
}
