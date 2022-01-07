package com.coderhouse;

import Animals.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List <Animal> animals = new ArrayList( );

        do{
            Animal animal = createAnimal();

            if(animal != null)
                animals.add(animal);

            System.out.println("-------------------------------------------------------");
            for (Animal a: animals) {
                System.out.println("["+a.getClass()+"] ");
            }
            System.out.println("-------------------------------------------------------\n");

        }while(true);

    }

    public static Animal createAnimal(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Elija un animal: \n");
        System.out.println("1- Pajaro");
        System.out.println("2- Gato");
        System.out.println("3- Vaca");
        System.out.println("4- Perro");
        System.out.println("5- Pez");
        System.out.println("6- Mono");

        System.out.print("\nSu opción: ");

        try{

            return defineAnimal(sc.nextInt());

        }catch(InputMismatchException e){

            System.out.println("\nError: Solo puede ingresar números.");
            return null;

        }

    }

    public static Animal defineAnimal(Integer opt) {

        Animal animal = null;

        switch (opt){
            case 1:
                animal = new Bird();
                break;

            case 2:
                animal = new Cat();
                break;

            case 3:
                animal = new Cow();
                break;

            case 4:
                animal = new Dog();
                break;

            case 5:
                animal = new Fish();
                break;

            case 6:
                animal = new Monkey();
                break;

            default:
                System.out.println("\nOpcion invalida!");
        }

        return animal;
    }
}


