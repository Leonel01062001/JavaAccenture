import claseAbstracta.Cuadrado;

public class Calculo {
    private final static double LADO_CUADRADO = 2.0;
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.setLado(Calculo.LADO_CUADRADO);
        System.out.println("El area es: " + cuadrado1.calcularArea());
        System.out.println("El perimetro es: " + cuadrado1.calcularPerimetro());
    }
}
