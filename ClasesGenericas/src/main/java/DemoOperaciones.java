import claseGenerica.Operaciones;

public class DemoOperaciones {
    public static void main(String[] args) {
        Operaciones<Integer> op1 = new Operaciones();
        Operaciones<Double> op2 = new Operaciones();

        System.out.println(op1.suma(5));
        System.out.println(op1.resta(5));
        System.out.println(op1.producto(5));
        System.out.println(op1.division(5));

        System.out.println(op2.suma(12.34));
        System.out.println(op2.resta(12.34));
        System.out.println(op2.producto(12.34));
        System.out.println(op2.division(12.34));

    }
}
