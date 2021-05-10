package com.company;

public enum Tipo {
    COLECTIVO("Colectivo", "rojo"),
    AUTO("Auto", "cyan"),
    MOTO("Moto", "verde"),
    MOTOELECTRICA("Motoelectrica", "roja"),
    AUTOELECTRICO("Autoelectrico", "amarillo");

    private final String nombre;
    private final String descripcion;


    Tipo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}




