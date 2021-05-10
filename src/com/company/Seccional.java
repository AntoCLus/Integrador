package com.company;

public class Seccional {
    private String seccional;
    public Seccional(String seccional) {
        this.seccional = seccional;
    }
    public Seccional() { }
    public String getSeccional() {
        return seccional;
    }
    public void setSeccional(String seccional) {
        this.seccional = seccional;
    }
    public void addSeccional(String seccional){
        addSeccional("Rivadavia");
        addSeccional("Moreno");
        addSeccional("Quilmes");
        addSeccional("Flores");




    }

}
