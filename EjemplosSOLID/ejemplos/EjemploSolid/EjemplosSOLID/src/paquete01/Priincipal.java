package paquete01;

import java.util.ArrayList;

public class Priincipal {

    public static void main(String[] args) {

        ArrayList<Persona> miLista = new ArrayList<>();
        Persona p1 = new Persona("Oliver", 18);
        Persona p2 = new Persona("Luis", 20);

        System.out.printf("%s\n", p1.obtenerEdad());
        System.out.printf("%s\n", p2.obtenerEdad());
        miLista.add(p1);
        miLista.add(p2);
        
        double promedio = p2.promedioEdades(miLista);
        System.out.println(promedio);

    }
}
