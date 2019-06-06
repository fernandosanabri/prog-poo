import java.util.Scanner;

public class programa1 {


    Scanner entrada = new Scanner(System.in);


    public void nombre() {
        System.out.println("binvenidos al taller_1");
        System.out.println("Problema#1");
        System.out.println("Ingresar Nombre:");
        String name = entrada.nextLine();
        System.out.println("su nombre es:" + name);
    }


    public void mostrar() {

        System.out.println("Problema#2");
        System.out.println("Ingresar Nombre:");
        String name = entrada.nextLine();


        System.out.println("Ingresar apellido:");
        String surname = entrada.nextLine();
        System.out.println("Ingresar año de nacimiento:");
        int edad = entrada.nextInt();

        int añon = edad;
        int añoa = 2019;
        int edadac = añoa - añon;
        System.out.println("su nombre completo es:" + name + surname);
        System.out.println("su edad es:" + edadac);


    }

    public void edad_mos() {

        System.out.println("Problema#3");
        System.out.println("Ingresar Nombre:");
        String name = entrada.nextLine();

        System.out.println("Ingresar año de nacimiento:");
        int edad = entrada.nextInt();

        int añon = edad;
        int añoa = 2019;
        int edadac = añoa - añon;
        System.out.println("su nombre:" + name);
        System.out.println("su edad es:" + edadac);


    }

    public void entrada() {
        System.out.println("Problema#4");
        System.out.println("Ingresar Nombre cliente:");
        String name = entrada.nextLine();
        System.out.println("Ingresar Total del Cliente:");

        double total = entrada.nextInt();

        double subtotal = total;
        double itbm = 1.07;
        double Ptotal = subtotal * itbm;
        System.out.println("Nobre del Cliente es:" + name);
        System.out.println("Monto a Pagar:" + Ptotal);
    }

    public void comercio() {

        System.out.println("Problema#5");

        System.out.println("Ingresar Nombre Articulo:");
        String articulo = entrada.nextLine();
        System.out.println("Ingresar precio del articulo:");

        float precio = entrada.nextInt();

        float subtotal = precio;
        float total = subtotal / 100;
        float gan = total * 30+ precio;




        System.out.println("Monto a ganar:"+articulo+ gan);
    }

    public void tiempos() {

        int dia1;
        int dia2;
        int dia3;
        int dia4;
        int dia5;
        float suma;
        float promedio;

        System.out.println("Problema#6");
        System.out.println("Ingresar Nombre del Atleta:");
        String name = entrada.nextLine();
        System.out.println("Ingresar primer dato:");
        dia1 = entrada.nextInt();
        System.out.println("Ingresar segundo dato:");
        dia2 = entrada.nextInt();
        System.out.println("Ingresar tercer dato:");
        dia3 = entrada.nextInt();
        System.out.println("Ingresar cuarto dato:");
        dia4 = entrada.nextInt();
        System.out.println("Ingresar quinto dato:");
        dia5 = entrada.nextInt();

        suma = dia1 + dia2 + dia3 + dia4 + dia5;
        promedio = suma / 5;


        System.out.println("Nobre del Atleta es:" + name);
        System.out.println("el Promedio de los  5 Tiempos registrados es:" + promedio);
    }
}

