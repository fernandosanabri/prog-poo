package Parcial1_problema1;

import java.util.Scanner;

public class Problema2 {


    public void parcial() {
        System.out.println("Problema#2");


        double total = 0;
        //Vector nota = new Vector();
        int[] notas = new int[4];
        String nom = "";
        String apell = "";
        double promedio=0;


        Scanner entrada = new Scanner(System.in);
        System.out.println("nombre");
        nom = entrada.next();

        System.out.println("apellido");
        apell = entrada.next();


        System.out.println("calificacion #1 ->");
        notas[0] = entrada.nextInt();
        System.out.println("calificacion #2 ->");
        notas[1] = entrada.nextInt();
        System.out.println("calificacion #3 ->");
        notas[2] = entrada.nextInt();
        System.out.println("calificacion #4 ->");
        notas[3] = entrada.nextInt();


        double temp = (notas[0] + notas[1] + notas[2] + notas[3]);

        promedio = temp/4;

        System.out.println("Su nombre es: -> " + nom+ " " + apell +", su promedio es de: "+ promedio);

        if (promedio >= 71) {
            System.out.println("Aprobo");
        } else if (promedio <= 70) {
            System.out.println("No Aprobo");


        }

    }}
