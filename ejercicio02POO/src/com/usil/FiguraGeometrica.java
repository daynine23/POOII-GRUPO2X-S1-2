package com.usil;

public abstract class FiguraGeometrica {

    private String nombre;

    public FiguraGeometrica() {
        this.nombre = "Figura Geométrica";
    }

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreFigura) {
        this.nombre = nombreFigura;
    }

    public abstract double calcularAreaFigura();

    public abstract boolean esRegular();

    @Override
    public String toString() {
        return nombre;
    }
}
