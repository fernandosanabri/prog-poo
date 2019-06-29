package Parcial1_problema1;
import java.util.Scanner;

public class Problema4 {
    //Problema que calcula total y descuento de hospedaje


    public void ejecutar() {

        String nombre=" ";
        String apellido=" ";
        int edad=0;
        int cantidadDias=0;
        float subtotal=0;
        double descuento=0;
        double totalPagar=0;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido al programa # 4 --->");
        System.out.println("Ingrese su nombre : ");
        nombre = entrada.next();
        System.out.println("Ingrese su apellido : ");
        apellido = entrada.next();
        System.out.println("Ingrese su edad : ");
        edad = entrada.nextInt();
        System.out.println("Ingrese cantidad de dias hospedado : ");
        cantidadDias = entrada.nextInt();

        int opcion;

        System.out.println();
        System.out.println("- - - - - - - - - - - - - - ");
        System.out.println("    Hotel Guamuchil");
        System.out.println("- - - - - - - - - - - - - - ");
        System.out.println();
        System.out.println("Tipo de Habitacion");
        System.out.println("1. Habitacion 1");
        System.out.println("2. Habitacion 2");
        System.out.println("3. Habitacion 3");
        System.out.println("4. Habitacion 4");
        System.out.println("5. Habitacion 5");
        System.out.println("");
        System.out.println("Seleccione un Tipo de Habitacion: ");

        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Usted Ingreso la habitacion 1");
                if(cantidadDias>=15){
                    subtotal= 120*cantidadDias;
                    descuento=subtotal*0.20;
                    totalPagar=subtotal-descuento;
                }
                else if (cantidadDias>=10&& cantidadDias<=15){
                    subtotal= 120*cantidadDias;
                    descuento=subtotal*0.15;
                    totalPagar=subtotal-descuento;
                }
                else if (cantidadDias>5&& cantidadDias<=10){
                    subtotal= 120*cantidadDias;
                    descuento=subtotal*0.10;
                    totalPagar=subtotal-descuento;
                }
                else
                {
                    subtotal= 120*cantidadDias;
                    descuento=0;
                    totalPagar=subtotal-descuento;
                }

                System.out.println("Estimado "+nombre+" "+apellido+", usted tiene "+edad+ " años, se hospedo: "+cantidadDias+" dias;");
                System.out.println("El subtotal de su cuenta es: $"+subtotal+", su descuento es de : $"+descuento+", y su total a pagar es de: $"+totalPagar);
                break;

            case 2:
                System.out.println("Usted Ingreso la habitacion 2");
                if(cantidadDias>=15){
                    subtotal= 155*cantidadDias;
                    descuento=subtotal*0.20;
                    totalPagar=subtotal-descuento;
                }
                else if (cantidadDias>=10&& cantidadDias<=15){
                    subtotal= 155*cantidadDias;
                    descuento=subtotal*0.15;
                    totalPagar=subtotal-descuento;
                }
                else if (cantidadDias>5&& cantidadDias<=10){
                    subtotal= 155*cantidadDias;
                    descuento=subtotal*0.10;
                    totalPagar=subtotal-descuento;
                }
                else {
                    subtotal= 120*cantidadDias;
                    descuento=0;
                    totalPagar=subtotal-descuento;
                }

                System.out.println("Estimado "+nombre+" "+apellido+", usted tiene "+edad+ " años, se hospedo: "+cantidadDias+" dias;");
                System.out.println("El subtotal de su cuenta es: $"+subtotal+", su descuento es de : $"+descuento+", y su total a pagar es de: $"+totalPagar);
                break;
            case 3:
                System.out.println("Usted Ingreso la habitacion 3");
                if(cantidadDias>=15){
                    subtotal= 210*cantidadDias;
                    descuento=subtotal*0.20;
                    totalPagar=subtotal-descuento;
                }
                else if (cantidadDias>=10&& cantidadDias<=15){
                    subtotal= 210*cantidadDias;
                    descuento=subtotal*0.15;
                    totalPagar=subtotal-descuento;
                }
                else if (cantidadDias>5&& cantidadDias<=10){
                    subtotal= 210*cantidadDias;
                    descuento=subtotal*0.10;
                    totalPagar=subtotal-descuento;
                }

                else {
                    subtotal= 120*cantidadDias;
                    descuento=0;
                    totalPagar=subtotal-descuento;
                }

                System.out.println("Estimado "+nombre+" "+apellido+", usted tiene "+edad+ " años, se hospedo: "+cantidadDias+" dias;");
                System.out.println("El subtotal de su cuenta es: $"+subtotal+", su descuento es de : $"+descuento+", y su total a pagar es de: $"+totalPagar);

                break;
            case 4:
                System.out.println("Usted Ingreso la habitacion 4");
                if(cantidadDias>=15){
                    subtotal= 185*cantidadDias;
                    descuento=subtotal*0.20;
                    totalPagar=subtotal-descuento;
                }
                else if (cantidadDias>=10&& cantidadDias<=15){
                    subtotal= 185*cantidadDias;
                    descuento=subtotal*0.15;
                    totalPagar=subtotal-descuento;
                }
                else if (cantidadDias>5&& cantidadDias<=10){
                    subtotal= 185*cantidadDias;
                    descuento=subtotal*0.10;
                    totalPagar=subtotal-descuento;
                }
                else {
                    subtotal= 120*cantidadDias;
                    descuento=0;
                    totalPagar=subtotal-descuento;
                }

                System.out.println("Estimado "+nombre+" "+apellido+", usted tiene "+edad+ " años, se hospedo: "+cantidadDias+" dias;");
                System.out.println("El subtotal de su cuenta es: $"+subtotal+", su descuento es de : $"+descuento+", y su total a pagar es de: $"+totalPagar);
                break;
            case 5:
                System.out.println("Usted Ingreso la habitacion 5");
                if(cantidadDias>=15){
                    subtotal= 400*cantidadDias;
                    descuento=subtotal*0.20;
                    totalPagar=subtotal-descuento;
                }
                else if (cantidadDias>=10&& cantidadDias<=15){
                    subtotal= 400*cantidadDias;
                    descuento=subtotal*0.15;
                    totalPagar=subtotal-descuento;
                }
                else if (cantidadDias>5&& cantidadDias<=10){
                    subtotal= 400*cantidadDias;
                    descuento=subtotal*0.10;
                    totalPagar=subtotal-descuento;
                }
                else {
                    subtotal= 120*cantidadDias;
                    descuento=0;
                    totalPagar=subtotal-descuento;
                }

                System.out.println("Estimado "+nombre+" "+apellido+", usted tiene "+edad+ " años, se hospedo: "+cantidadDias+" dias;");
                System.out.println("El subtotal de su cuenta es: $"+subtotal+", su descuento es de : $"+descuento+", y su total a pagar es de: $"+totalPagar);
                break;
                default:
                System.out.println("");
                System.out.println("- - - - - - - - - - - - - - ");
                System.out.println(" - Saliendo del sistema -");
                System.out.println("- - - - - - - - - - - - - - ");
                System.out.println("");
                System.exit(0);
                break;


    }
}}







