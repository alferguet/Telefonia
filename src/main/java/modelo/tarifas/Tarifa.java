package modelo.tarifas;

import modelo.datos.Llamada;

import java.io.Serializable;

public abstract class Tarifa implements Serializable {

    double precio;

    public Tarifa(double precio) {
        this.precio = precio;
    }

    public abstract double precioLlamada(Llamada llamada);

    public abstract double getPrecio();

    @Override
    public String toString() {
        return precio + "€";
    }

    public void swpPrecio(double precio) {
        this.precio=precio;
    }

}
