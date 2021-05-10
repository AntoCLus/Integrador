package com.company;

import java.awt.*;
import java.time.LocalDate;

//Se desea poder listar todos los autos registrados en todas las seccionales.
public class Auto extends Automotor implements VehiculoACombustion {
    private static final String seccional = null ;
    private static final String cambioDePropietario = null ;
    private final String modelo = null;
    private String Propietario = null;


    public Auto(String modelo, LocalDate alta, String propietario) {
        super();
        Propietario = propietario;
    }

    public Auto(String modelo, Color color, com.company.Propietario conductor, String propietario) {
        super();
        Propietario = propietario;
    }

    public Auto(String seccional, String cambioDePropietario, String propietario) {
        super();
        Propietario = propietario;
    }

    public String getSeccional() {
        return seccional;
    }

    public static String getCambioDePropietario() {
        return cambioDePropietario;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    @Override
    public void combustible() {

    }

    @Override
    public void electricidad() {

    }
}
