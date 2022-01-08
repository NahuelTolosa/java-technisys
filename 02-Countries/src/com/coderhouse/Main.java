package com.coderhouse;

import Countries.Country;

import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println( "\nInicio de la ejecucion del programa -->\t" + getTime(Clock.systemUTC()) + "\n");

        List<Country> countries = setCountries();

        menu(option(), countries);

        System.out.println( "\nFinal de la ejecucion del programa  -->\t" + getTime(Clock.systemUTC()) );

    }

    public static Instant getTime(Clock time){
        return time.instant();
    }

    public static List setCountries (){

        List<Country> countries = new ArrayList();

        countries.add(new Country("ARG", "Argentina", "54"));
        countries.add(new Country("BOL", "Bolivia", "591"));
        countries.add(new Country("BRA", "Brasil", "55"));
        countries.add(new Country("CHI", "Chile", "56"));
        countries.add(new Country("COL", "Colombia", "57"));
        countries.add(new Country("ECU", "Ecuador", "593"));
        countries.add(new Country("GUY", "Guyana", "592"));
        countries.add(new Country("PRY", "Paraguay", "595"));
        countries.add(new Country("PER", "Peru", "51"));
        countries.add(new Country("SUR", "Surinam", "597"));
        countries.add(new Country("URY", "Uruguay", "598"));
        countries.add(new Country("VEN", "Venezuela", "58"));

        return countries;
    }

    public static Integer option(){

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que desea hacer?\n");
        System.out.println("1- Mostrar paises sudamericanos con sus codigos.");
        System.out.println("2- Buscar pais sudamericano ingresando su codigo.");
        System.out.print("\nSu opcion: ");

        try{
            return sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Error: Solo puede ingresar numeros!");
            return 0;
        }

    }

    public static void menu ( Integer option, List<Country> countries ){
        switch (option){
            case 1:

                System.out.println("\nPaises:\n");
                for (Country c : countries) {
                    System.out.println("-----------------------------------------\n");
                    System.out.println("\t" + c.toString() + "\n");
                }

                break;

            case 2:

                Scanner sc = new Scanner(System.in);
                System.out.print("\nIngrese el codigo el pais: ");
                String code = sc.nextLine();

                List<Country> newList = countries.stream().filter( c -> c.getCode() == code).collect(Collectors.toList());

                if(newList != null){
                    System.out.print("\n\tPais: ");
                    System.out.println(countries.stream().filter( c -> c.getCode().equals(code)).collect(Collectors.toList()));
                }else{
                    System.out.println("No hay pais con el codigo ingresado.\n");
                }

                break;
        }
    }
}
