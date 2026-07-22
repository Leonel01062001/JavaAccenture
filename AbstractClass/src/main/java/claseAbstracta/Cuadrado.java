package claseAbstracta;

public class Cuadrado extends FiguraGeometrica{

    private final int NUM_LADOS_IGUALES = 4;
    private double lado;

    public Cuadrado(){

    }
    public Cuadrado(int lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado*this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado*4;
    }

    public int getNUM_LADOS_IGUALES() {
        return NUM_LADOS_IGUALES;
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
