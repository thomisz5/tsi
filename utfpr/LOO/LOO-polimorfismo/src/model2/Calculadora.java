package model2;

import java.util.ArrayList;

public class Calculadora {
    public static void main(String[] args) {

        ArrayList<Poligono> poligonos = new ArrayList<>();
        poligonos.add(new Quadrado());
        poligonos.add(new Circulo());

        for (int i = 0; i < poligonos.size(); i++) {//1ºfor
            poligonos.get(i).calculaArea();
        }
        for (Poligono poligono : poligonos){//2ºfor
            poligono.calculaArea();
        }
    }
}
