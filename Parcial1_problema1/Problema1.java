package Parcial1_problema1;
import java.util.Scanner;

public class Problema1 {
    //Problema que Calcula e imprime el costo de un terreno cuadrado


    public void ejecutar() {

        float ancho =0;
        float longitud =0;
        int costoMetro=100;
        float totalMetro=0;
        float costoTerreno=0;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido al programa # 1 --->");
        System.out.println("Ingrese el ancho del terreno : ");
        ancho = entrada.nextFloat();
        System.out.println("Ingrese la longitud del terreno : ");
        longitud = entrada.nextFloat();


        //calculo del metraje
        totalMetro=ancho*longitud;


        System.out.println("El terreno tiene : "+totalMetro+" metros cuadrados");

        //calculo del valor terreno
        costoTerreno=totalMetro*costoMetro;


        System.out.println("El costo final del terreno es de "+"$"+costoTerreno);




    }
}







