package claseGenerica;

public class Operaciones <N extends Number> {

    public double suma(N numero) {
        return numero.doubleValue() +2;
    }
    public double resta(N numero) {
        return numero.doubleValue() -2;
    }
    public double producto(N numero) {
        return numero.doubleValue() *2;
    }
    public double division(N numero) {
        return numero.doubleValue() /2;
    }

}
