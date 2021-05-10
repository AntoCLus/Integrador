package com.company;

import java.awt.*;
import java.time.LocalDate;
import java.util.Date;

public class Automotor implements VehiculoACombustion, VehiculoElectrico{
    protected String patente;
    protected Propietario propietario;
    private String seccional;
    private Date alta;
    private Tipo tipo;
    private static Color colorPatente = Color.CYAN;
    private LocalDate fechaAlta;

    public Automotor() {
    }

    public Automotor(String patente, Propietario propietario, String seccional, Date alta, Tipo tipo, LocalDate fechaAlta) {
        this.patente = patente;
        this.propietario = propietario;
        this.seccional = seccional;
        this.alta = alta;
        this.tipo = tipo;
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Automotor{" +
                "patente='" + patente + '\'' +
                ", propietario=" + propietario +
                ", seccional='" + seccional + '\'' +
                ", alta=" + alta +
                ", tipo=" + tipo +
                ", fechaAlta=" + fechaAlta +
                '}';
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getPropietario() {
        return String.valueOf(propietario);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getSeccional() {
        return seccional;
    }

    public void setSeccional(String seccional) {
        this.seccional = seccional;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automotor.colorPatente = colorPatente;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
     public void fechaAlta(){
         LocalDate fechaAlta = LocalDate.now();
         System.out.println("La fecha de alta es " + fechaAlta);
         System.out.println("");
     }
    @Override
    public void combustible() {

    }

    @Override
    public void electricidad() {

    }
}
