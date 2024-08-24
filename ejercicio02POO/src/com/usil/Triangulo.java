package com.usil;


/**
 *
 * @author Kevin Cabezas
 */
public class Triangulo extends FiguraGeometrica{

    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo() {
        super("Triángulo");
        this.punto1 = new Punto();
        this.punto2 = new Punto();
        this.punto3 = new Punto();
    }

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        super("Triángulo");
        this.punto1 = p1;
        this.punto2 = p2;
        this.punto3 = p3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    @Override
    public String toString() {
        return "Triángulo: " + getNombre() + " tiene 3 Puntos: " +
                getPunto1().toString() + ", " +
                getPunto2().toString() + ", " +
                getPunto3().toString();
    }

    @Override
    public double calcularAreaFigura() {
        if (punto1 == null || punto2 == null || punto3 == null) {
            throw new IllegalStateException("Un triángulo debe tener 3 puntos.");
        }

        double x1 = punto1.getCoordenada_x();
        double y1 = punto1.getCoordenada_y();
        double x2 = punto2.getCoordenada_x();
        double y2 = punto2.getCoordenada_y();
        double x3 = punto3.getCoordenada_x();
        double y3 = punto3.getCoordenada_y();

        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }

    @Override
    public boolean esRegular() {
        double d1 = punto1.getDistance(punto2);
        double d2 = punto2.getDistance(punto3);
        double d3 = punto3.getDistance(punto1);
        return d1 == d2 && d2 == d3;
    }
}
