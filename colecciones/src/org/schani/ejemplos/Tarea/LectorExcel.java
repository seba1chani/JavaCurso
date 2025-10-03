package org.schani.ejemplos.Tarea;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.schani.ejemplos.modelos.Vuelo;
import org.schani.ejemplos.modelos.Fecha;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class LectorExcel {
    public static Vuelos leerVuelosDesdeExcel(String rutaArchivo) {
        Vuelos vuelos = new Vuelos();

        try (FileInputStream fis = new FileInputStream(rutaArchivo);
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue;

                String nombre = row.getCell(0).getStringCellValue().trim();
                String origen = row.getCell(1).getStringCellValue().trim();
                String destino = row.getCell(2).getStringCellValue().trim();
                String fechaTexto = row.getCell(3).getStringCellValue().trim();
                String horaTexto = row.getCell(4).getStringCellValue().trim();
                int pasajeros = (int) row.getCell(5).getNumericCellValue();

                Fecha llegada = new Fecha(fechaTexto, horaTexto);
                Vuelo vuelo = new Vuelo(nombre, origen, destino, llegada, pasajeros);
                vuelos.agregarVuelo(vuelo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return vuelos;
    }

}
