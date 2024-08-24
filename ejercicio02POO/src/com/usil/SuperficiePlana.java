package com.usil;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Kevin Cabezas
 */
public class SuperficiePlana {

    private List<FiguraGeometrica> figurasGeometricas;

    public SuperficiePlana() {
        this.figurasGeometricas = new ArrayList<>();
    }

    public void agregarFigura(FiguraGeometrica figura) {
        if (figura != null) {
            figurasGeometricas.add(figura);
        }
    }

    public void eliminarFigura(FiguraGeometrica figura) {
        figurasGeometricas.remove(figura);
    }


    public boolean contieneFiguraRegular() {
        for (FiguraGeometrica figura : figurasGeometricas) {
            if (figura.esRegular()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Superficie Plana con figuras geométricas:\n");
        for (FiguraGeometrica figura : figurasGeometricas) {
            sb.append(figura.toString()).append("\n");
        }
        return sb.toString();
    }

}
