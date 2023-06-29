/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private double edadMinima;
    private int edadMaxima;
    private String listaCiudadesEstudiantes;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma += e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public void establecerEdadMinima() {
        int edadMenor = Integer.MAX_VALUE;
        for (Persona e : obtenerEstudiante()) {
            if (e.obtenerEdad() < edadMenor) {
                edadMenor = e.obtenerEdad();
            }
            edadMinima = edadMenor;
        }

    }

    public void establecerEdadMaxima() {

        int edadMayor = Integer.MAX_VALUE;
        for (Persona e : obtenerEstudiante()) {
            if (e.obtenerEdad() > edadMayor) {
                edadMayor = e.obtenerEdad();
            }
            edadMaxima = edadMayor;

        }

    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    public double obtenerEdadMinima() {
        return edadMinima;
    }

    public double obtenerEdadMaxima() {
        return edadMaxima;
    }
}
