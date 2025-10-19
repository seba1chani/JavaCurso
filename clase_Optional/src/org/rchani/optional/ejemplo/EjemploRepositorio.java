package org.rchani.optional.ejemplo;

import org.rchani.optional.ejemplo.models.Computador;
import org.rchani.optional.ejemplo.models.repositorio.ComputadorRepositorio;
import org.rchani.optional.ejemplo.models.repositorio.Repositorio;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio= new ComputadorRepositorio();
        Computador pc= repositorio.filtrar("asus rog");

        if(pc!=null) {
            System.out.println(pc.getNombre());
        }else{
            System.out.println("No se encontro");
        }
    }
}
