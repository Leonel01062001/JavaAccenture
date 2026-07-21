package ClasesObjetos;

import ClasesObjetos.herencia.Empleado;

public class Empresa {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Leonel");
        empleado1.setEdad(25);
        empleado1.setDni("2465");
        empleado1.setPrimerApellido("Rios");
        empleado1.setSegundoApellido("Cortes");
        empleado1.setAntiguedad(5);
        empleado1.setPuesto("Developer jr");
        empleado1.actualizarSalario(12000);

        System.out.println(empleado1);
    }
}
