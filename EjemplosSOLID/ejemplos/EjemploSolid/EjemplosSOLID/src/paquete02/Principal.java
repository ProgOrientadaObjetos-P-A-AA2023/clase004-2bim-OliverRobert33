package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Persona p1 = new Persona("Oliver", 18);
        Persona p2 = new Persona("Luis", 20);

        OperacionesEstudiantes op1 = new OperacionesEstudiantes();

        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);

        op1.establecerEstudiante(lista);
        op1.establecerPromedioEdades();
        op1.establecerEdadMinima();
        op1.establecerEdadMaxima();

        System.out.printf("Edad menor: %.0f\n", op1.obtenerEdadMinima());
        System.out.printf("Edad mayor: %.0f\n", op1.obtenerEdadMaxima());

    }
}
