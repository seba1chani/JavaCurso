package org.schani.ejemplos.Tarea;


import org.schani.ejemplos.modelos.Vuelo;

import java.util.List;

public class TestVuelos {
    public static void main(String[] args) {
        Vuelos gestionVuelos= new Vuelos();
        gestionVuelos.cargarVuelos();
        //List<Vuelo>lista= gestionVuelos.getVuelos();
/*
        Object a[]= lista.toArray();
        System.out.println("Lista ordenada acendente ");
        for(int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

 */
        System.out.println("==============================");
        gestionVuelos.ultimoVuelo();
       // gestionVuelos.menosPasajeros();
        System.out.println(gestionVuelos);


    }
}
