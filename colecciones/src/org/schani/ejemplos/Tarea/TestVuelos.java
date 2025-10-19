package org.schani.ejemplos.Tarea;


import org.schani.ejemplos.modelos.Vuelo;

import java.util.List;

public class TestVuelos {
    public static void main(String[] args) {
        Vuelos gestionVuelos= new Vuelos();
        gestionVuelos.cargarVuelos();
        System.out.println(gestionVuelos);
        System.out.println("==============================");
        gestionVuelos.ultimoVuelo();
        gestionVuelos.menosPasajeros();


    }
}
