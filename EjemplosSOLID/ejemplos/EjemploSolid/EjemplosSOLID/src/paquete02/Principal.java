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
        
        System.out.println(op1.obtenerPromedioEdades());
    }
}
