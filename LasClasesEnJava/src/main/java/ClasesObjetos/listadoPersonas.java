package ClasesObjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listadoPersonas {
    public static void main(String[] args) {
        Persona p1 = new Persona("Alex", "Muñoz", "Velasco", "12.345.678-L", 25);
        Persona p2 = new Persona("Ana", "Gil", "Gil", "12.345.678-L", 55);
        Persona p3 = new Persona("Erik", "Muñoz", "Velasco", "12.345.678-L", 34);
        Persona p4 = new Persona("Sara", "Sanz", "Pérez", "12.345.678-L", 48);

        List<Persona> listaPers = new ArrayList<Persona>();
        listaPers.add(p1);
        listaPers.add(p2);
        listaPers.add(p3);
        listaPers.add(p4);

        for (Persona per: listaPers) {
            System.out.println(per);
        }

        Collections.sort(listaPers);

        for (Persona per: listaPers) {
            System.out.println(per);
        }
    }
}
