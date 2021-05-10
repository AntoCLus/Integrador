package com.company;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private int DNI;
    private String Nombre;
    private String Seccional;



    public Propietario(int dni, String nombre, String seccional) {
        DNI = dni;
        Nombre = nombre;
        Seccional = seccional;
    }

    public Propietario() {

    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getSeccional() {
        return Seccional;
    }



    public void addPropietario(String DNI, String nombre, String seccional){
        addPropietario("335694", "Raul Conrado", getSeccional());
        addPropietario("3356987", "Estela Maris", getSeccional());
        addPropietario("8974563", "Milton Schneider", getSeccional());
        }

}
