package com.usil;


/**
 *
 * @author Kevin Cabezas
 */
public class Punto {

    private int coordenada_x;
    private int coordenada_y;

    public String toString() {
        return ("El punto tiene las siguientes coordenadas: " + coordenada_x + "," + coordenada_y);
    }

    public Punto() {
        this.coordenada_x = 0;
        this.coordenada_y = 0;
    }

    public Punto( int coordenadaX, int coordenadaY) {
        this.coordenada_x = coordenadaX;
        this.coordenada_y = coordenadaY;
    }

    public int getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public int getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    public double getDistance(Punto otroPunto) {
        double deltaX = otroPunto.coordenada_x - this.coordenada_y;
        double deltaY = otroPunto.coordenada_y - this.coordenada_y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double getDistancia() {
        Punto puntoBase = new Punto(0, 0);
        return getDistance(puntoBase);
    }
}
