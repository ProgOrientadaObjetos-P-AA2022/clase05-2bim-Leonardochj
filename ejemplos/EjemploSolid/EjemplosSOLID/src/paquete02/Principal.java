/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        ArrayList<Persona> listaEstudiantes = new ArrayList<>();
        Persona p1 = new Persona("Carlos", 18);
        listaEstudiantes.add(p1);
        Persona p2 = new Persona("Pablo", 15);
        listaEstudiantes.add(p2);
        Persona p3 = new Persona("Leonardo", 19);
        listaEstudiantes.add(p3);
        Persona p4 = new Persona("Miguel", 17);
        listaEstudiantes.add(p4);
        Persona p5 = new Persona("Antonio", 16);
        listaEstudiantes.add(p5);
        
        OperacionesEstudiantes operaciones = new OperacionesEstudiantes();
        operaciones.establecerEstudiante(listaEstudiantes);
        operaciones.establecerPromedioEdades();
        
        System.out.printf("%s\n", operaciones);
    }
}
