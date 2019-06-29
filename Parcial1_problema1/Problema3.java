package Parcial1_problema1;
import java.util.Scanner;

public class Problema3 {
    //Problema que calcula descuentos de acuerdo a la cantidad de trajes comprados


    public void ejecutar() {

        int cantidad=0;
        float precio =0;
        float subtotal=0;
        double descuento=0;
        double totalPagar=0;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido al programa # 3 --->");
        System.out.println("Ingrese la cantidad de trajes : ");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese el precio del traje : ");
        precio = entrada.nextFloat();


        //calculo del subtotal
        subtotal = cantidad*precio;

        System.out.println("El subtotal de la compra es: $"+subtotal);

        //calculo del descuento

        if(cantidad >=3){
            descuento= subtotal*0.65;

            System.out.println("El descuento del 65% de su compra es: $"+descuento);

        }
        else if(cantidad==2){
            descuento= subtotal*0.55;

            System.out.println("El descuento del 55% de su compra es: $"+descuento);

        }
        else if(cantidad==1){
            descuento= subtotal*0.50;

            System.out.println("El descuento del 50% de su compra es: $"+descuento);

        }
        else {

            System.out.println("Error, Ingrese una cantidad mayor a 0");
        }

        //calculo del total a pagar

        totalPagar= subtotal-descuento;

        System.out.println("El total a pagar es de: $"+totalPagar);


    }
}







