package org.schani.ejemplos.modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class Fecha {
    private LocalDateTime fechaHora;

    // Formatter más flexible para meses en español
    private static final DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .parseCaseInsensitive()
            .appendPattern("d MMM yyyy HH:mm 'hrs'")
            .toFormatter(new Locale("es", "ES"));

    public Fecha(String fechaStr, String horaStr) {
        try {
            // Combinar fecha y hora
            String fechaHoraCompleta = fechaStr + " " + horaStr;
            this.fechaHora = LocalDateTime.parse(fechaHoraCompleta, formatter);
        } catch (Exception e) {
            System.err.println("Error parseando fecha: " + fechaStr + " " + horaStr);
            System.err.println("Mensaje: " + e.getMessage());
            throw e;
        }
    }

    // ... el resto de los métodos igual
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getFechaFormateada() {
        DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaHora.format(fechaFormatter);
    }

    public String getHoraFormateada() {
        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm");
        return fechaHora.format(horaFormatter);
    }

    public String getFechaHoraCompleta() {
        DateTimeFormatter completoFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return fechaHora.format(completoFormatter);
    }

    public String getDiaSemana() {
        DateTimeFormatter diaFormatter = DateTimeFormatter.ofPattern("EEE", new Locale("es", "ES"));
        return fechaHora.format(diaFormatter);
    }

    @Override
    public String toString() {
        return getFechaHoraCompleta();
    }
}