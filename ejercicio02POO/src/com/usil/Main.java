package com.usil;

/**
 *
 * @author Kevin Cabezas
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 0);
        Punto p3 = new Punto(3, 4);

        Triangulo triangulo = new Triangulo(p1, p2, p3);
        SuperficiePlana superficie = new SuperficiePlana();
        superficie.agregarFigura(triangulo);

        System.out.println(triangulo);
        System.out.println("El área del triángulo es: " + triangulo.calcularAreaFigura());
        System.out.println("Es un triángulo regular? " + (triangulo.esRegular() ? "Sí" : "No"));
        System.out.println("Lista de Figuras Geometricas contiene figuras regulares? " + (superficie.contieneFiguraRegular()));

    }
}
