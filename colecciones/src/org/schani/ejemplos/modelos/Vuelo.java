package org.schani.ejemplos.modelos;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Fecha fechaYHora;
    private int cantidadPasajeros;

    public Vuelo( String nombre, String origen, String destino, Fecha fechaYHora, int cantidadPasajeros) {
        this.origen = origen;
        this.nombre = nombre;
        this.destino = destino;
        this.fechaYHora = fechaYHora;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Fecha getFechaYHora() {
        return fechaYHora;
    }
    public LocalDateTime getFechayHoraReal(){
        return fechaYHora.getFechaHora();
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String toString() {
        return nombre + ", origen='" + origen + "', destino='" + destino +
                "', fechaYHora=" + fechaYHora + ", cantidadPasajeros=" + cantidadPasajeros;
    }
}
