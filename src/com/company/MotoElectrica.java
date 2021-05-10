package com.company;

import java.awt.*;
import java.time.LocalDate;
import java.util.Date;

public class MotoElectrica extends Automotor implements VehiculoElectrico {
    public MotoElectrica() {
    }

    public MotoElectrica(String patente, Propietario propietario, String seccional, Date alta, Tipo tipo, LocalDate fechaAlta) {
        super(patente, propietario, seccional, alta, tipo, fechaAlta);
    }
}
