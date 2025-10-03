package org.schani.ejemplos.Tarea;

import org.schani.ejemplos.modelos.Fecha;
import org.schani.ejemplos.modelos.Vuelo;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class Vuelos {
    private List<Vuelo>vuelos;

    public Vuelos(){
        vuelos= new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo){
        vuelos.add(vuelo);
    }
    public void cargarVuelos(){
        vuelos.add(new Vuelo("AAL 933", "New York", "Santiago",
                new Fecha("29 Ago 2021", "05:39 hrs"), 62));

        vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago",
                new Fecha("31 Ago 2021", "04:45 hrs"), 47));

        vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago",
                new Fecha("30 Ago 2021", "16:00 hrs"), 52));

        vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago",
                new Fecha("29 Ago 2021", "13:22 hrs"), 59));

        vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago",
                new Fecha("31 Ago 2021", "14:05 hrs"), 25));

        vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago",
                new Fecha("31 Ago 2021", "05:20 hrs"), 29));

        vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago",
                new Fecha("30 Ago 2021", "08:45 hrs"), 55));

        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago",
                new Fecha("29 Ago 2021", "07:41 hrs"), 51));

        vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago",
                new Fecha("30 Ago 2021", "10:35 hrs"), 48));

        vuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago",
                new Fecha("29 Ago 2021", "09:14 hrs"), 59));

        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago",
                new Fecha("31 Ago 2021", "08:33 hrs"), 31));

        vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago",
                new Fecha("31 Ago 2021", "15:15 hrs"), 29));

        vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago",
                new Fecha("30 Ago 2021", "08:14 hrs"), 47));

        vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago",
                new Fecha("29 Ago 2021", "22:53 hrs"), 60));

        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago",
                new Fecha("31 Ago 2021", "09:57 hrs"), 32));

        vuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago",
                new Fecha("31 Ago 2021", "04:00 hrs"), 35));

        vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago",
                new Fecha("29 Ago 2021", "07:45 hrs"), 61));

        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago",
                new Fecha("30 Ago 2021", "07:12 hrs"), 58));

        vuelos.add(new Vuelo("LAT 501", "París", "Santiago",
                new Fecha("29 Ago 2021", "18:29 hrs"), 49));

        vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago",
                new Fecha("30 Ago 2021", "15:45 hrs"), 39));

        vuelos.sort((a,b)->a.getFechayHoraReal().compareTo(b.getFechayHoraReal()));
        //vuelos.sort((a,b)->a.getFechaYHora().getFecha().compareTo(b.getFechaYHora().getFecha()));
        //vuelos.sort(comparing(Vuelo::getFechayHoraReal));

    }
    public List<Vuelo> getVuelos(){
        return vuelos;
    }
    public void ultimoVuelo(){
        System.out.println("Ultimo vuelo en llegar es: " + vuelos.get(vuelos.size()-1));
    }
    public void menosPasajeros(){
        List<Vuelo>vuelosMenor= vuelos;
        vuelosMenor.sort(comparing(Vuelo::getCantidadPasajeros));
        System.out.println("el vuelo con menor pasajeros es: "+ vuelosMenor.get(0).getNombre()+" "
        +" "+vuelosMenor.get(0).getOrigen()+" "+vuelosMenor.get(0).getCantidadPasajeros());

    }

    @Override
    public String toString() {
        String aux="";
        for(Vuelo v:vuelos){
            aux+=v+"\n";
        }
        return aux;
    }

}
