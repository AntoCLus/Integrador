package com.company;
//Herramientas de java obligatorias:
//Enums, excepciones, random, listas, interfaces, herencia, Date o LocalDate.
//Consignas obligatorias:
//1)	Se desea poder listar todos los autos registrados en todas las seccionales.
//2)	Se desea poder listar a todos los propietarios (en orden alfabético) de camiones.
//3)	Los automotores pueden cambiar de propietario.
//4)	Se debe registrar la fecha de cambio de propietario.
//5)	Se debe poder dar de alta un nuevo automotor. Registrar esa fecha también.
//6)	No se puede cambiar de propietario si pasó menos de 1 año desde la fecha del último cambio de propietario.
//Consignas opcionales:
//1)	Cada automotor tiene una PATENTE única que se asigna automáticamente al realizar el alta o registro. Formatos de patente: AA123BB o ABC123.
//2)	Se puede consultar si pasó un año o más desde el registro o cambio de titular, para un auto en particular (se consulta por patente).



import java.text.Collator;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Seccional seccional = new Seccional();
        seccional.getSeccional();
        seccional.addSeccional("Entre Rios");
        seccional.setSeccional("Entre Rios");
        Propietario propietario = new Propietario();
        propietario.getDNI();
        propietario.getNombre();
        propietario.getSeccional();
        List<String> autosregistrados = new ArrayList<>();
        List<Colectivo> colectivo= new ArrayList<>();
        List<Moto> moto = new ArrayList<>();

            System.out.println("Bienvenido a DNRPA");
            Scanner scanner = new Scanner(System.in);
            int op = 0;
            do {
                System.out.println("Elija una opción: ");
                System.out.println("1. Mostrar propietarios de autos en orden alfabético.");
                System.out.println("2. Mostrar los autos registrados en todas las seccionales.");
                System.out.println("3. Mostrar fecha de alta");
                System.out.println("0. Salir");
                System.out.print("Opción: ");
                op = Integer.parseInt(scanner.nextLine());
                switch (op) {
                    case 1: listaPropietariosAlfabeticamente(); break;
                    case 2: listarSeccional();break;
                    case 3: fechaAlta();
                    case 4: salir();
                }

            } while (op != 0);
        }

    private static void salir() {
    }


    private static void listaPropietariosAlfabeticamente() {
        Collection<String> listaPropietariosAlfabeticamente =
                new TreeSet<String>(Collator.getInstance());
        listaPropietariosAlfabeticamente.add("Conrado, Raul");
        listaPropietariosAlfabeticamente.add("Estevanez, Miguel");
        listaPropietariosAlfabeticamente.add("Andrade, Victor");
        System.out.println(listaPropietariosAlfabeticamente + "-");

    }


    private static void listarSeccional() {
        Collection<String> listarSeccional=
                new TreeSet<String>(Collator.getInstance());
        listarSeccional.add("Flores");
        listarSeccional.add("Moreno");
        listarSeccional.add("Quilmes");
        Scanner scanner = new Scanner(System.in);
        List<Seccional> seccional= new ArrayList<>();
        int opcionElegida = Integer.parseInt(scanner.nextLine());
        System.out.println("Usted eligio la seccional de: " + seccional.get(opcionElegida));
    }



        public static void fechaAlta(){
            LocalDate fechaAlta = LocalDate.now();
            System.out.println("La fecha de alta es " + fechaAlta);
            System.out.println("");
        }
        public static void addSeccional(String seccional){
        Collection <String> addSeccional =
            new TreeSet<String>(Collator.getInstance());
        addSeccional("flores");
        addSeccional("moreno");

        }
    }





