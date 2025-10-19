package org.schani.api.stream.Tarea;

public class Producto {
    private double precio;
    private int cantidad;

    public Producto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getImporte(){
        return this.precio * this.cantidad;
    }

    @Override
    public String toString() {
        return  precio +
                ", cantidad=" + cantidad;
    }
}
