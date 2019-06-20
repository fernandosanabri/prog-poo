package taller2;

import java.util.Scanner;
import java.util.Vector;

public class casos2<dato> {

    int pais = 0;
    Scanner entrada = new Scanner(System.in);

    public void pais() {
        System.out.println("Problema#1");
        float area;
        System.out.print("Ingrese el Area:");
        area = entrada.nextFloat();
        if (area == 507) {
            System.out.println("Eres Local");
        } else {
            System.out.println("siguelo intentando");
        }
    }


    public void banco() {
        System.out.println("Problema#2");

        double interes = 0.02;
        double total = 0;
        double saldo = 0;
        Vector trans = new Vector ();
        float [] trans2 = new float[10];
        String nom="";
        String apell= "";
        float capital = 0;
        float temp = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("nombre");
        nom = entrada.next();

        System.out.println("apellido");
        apell = entrada.next();

        System.out.println("Monto de la inversion:");
        capital = entrada.nextFloat();
        System.out.println("Monto #1 ->");
        trans2[0] = entrada.nextFloat();
        System.out.println("Monto #2 ->");
        trans2[1] = entrada.nextFloat();
        System.out.println("Monto #3 ->");
        trans2[2] = entrada.nextFloat();
        System.out.println("Monto #4 ->");
        trans2[3] = entrada.nextFloat();
        System.out.println("Monto #5 ->");
        trans2[4] = entrada.nextFloat();
        System.out.println("Monto #5 ->");
        trans2[5] = entrada.nextFloat();
        System.out.println("Monto #6 ->");
        trans2[6] = entrada.nextFloat();
        System.out.println("Monto #7 ->");
        trans2[7] = entrada.nextFloat();
        System.out.println("Monto #8 ->");
        trans2[8] = entrada.nextFloat();
        System.out.println("Monto #9 ->");
        trans2[9] = entrada.nextFloat();
        // TODO: implementar con for
        // La logica

        temp = (trans2[0]+trans2[1]+trans2[2]+trans2[3]+trans2[4]+trans2[5]+trans2[6]+trans2[7]+trans2[8]+trans2[9]);

        saldo = capital + temp;




        if (saldo >= 1000) {
            interes += 0.05;
        }
        else  if (saldo >= 500) {
            interes += 0.03;
        }else  if (saldo >= 100) {
            interes += 0.01;
            //    interes = interes + 0.01;
        }else{
            System.out.println("no aplica");
        }
        total = saldo + (saldo * interes);
        System.out.println("Su total de mes es ->"+ total);

    }


    public void vocal() {

        System.out.println("Problema#3");

        String dato;
        System.out.println("Ingrese el Dto:");

        dato = entrada.next();


        if (dato != "a" && dato != "e" && dato != "i" && dato != "0" && dato != "u") {
            System.out.println("es vocal");
        } else {
            System.out.println("No es una vocal"+dato);
        }

        }



    public void desarr() {
        System.out.println("Problema#4");
        String detalle;
        int tiem;
        tiem = 0;

        System.out.println("Ingrese años de experiencia:");
        tiem = entrada.nextInt();

        if (tiem>=6){
            detalle =("Desarrollador Lead");

        }
        else if(tiem>=4&&tiem<6){
            detalle = ("Desarrollador Senior");
        }
        else if (tiem>=3&&tiem<4){
            detalle =("Desarrollador Intermedio");
        }
        else {
            detalle =("Desarrorrador Junior");
        }
        System.out.println("sus categorias son:"+detalle);
    }





        public double menu2() {
            System.out.println("Problema#5");

            System.out.println("Escoge La facultad.....");
            System.out.println("------------------ MENU ------------------");
            System.out.println("1. Ciencias Administrativas ");
            System.out.println("2. Ing Arquitectura y Diseño ");
            System.out.println("3. Ciencias de la salud ");
            System.out.println("4. Derecho y Ciencias Politicas ");
            System.out.println("5. Hoteleria Gastronomia ");
            System.out.println("6. Salir");
            System.out.print("Ingrese alguna de las opciones ---> ");

            double opc = entrada.nextInt();
            System.out.println("Su elección es " + opc);
            switch ((int) opc) {
                case 1:

                    System.out.println("1. Ciencias Administrativas ");
                    System.out.println ("Lic. en Administración de Negocios");
                    System.out.println   ("Lic. en Contabilidad");
                    System.out.println               ("Lic. en Administración de Recursos Humanos");
                    System.out.println     ("Lic. en Banca y Finanzas");
                    System.out.println ("Lic. en Comercio Internacional");
                    System.out.println ("Lic. en Negocios Internacionales");
                    System.out.println("Lic. en Comportamiento Organizacional y Desarrollo Humano");
                    System.out.println ("Lic. en Ingenieria Comercial");
                    System.out.println(" Lic. en Administración de Empresas Turísticas");
                    System.out.println ("Lic. en Mercadeo y Publicidad");
                    System.out.println ("Lic. en Mercadeo y Ventas");
                    System.out.println("NUEVA Lic. en Marketing Digital y Gerencia de Marc");
                    break;

                case 2:
                    System.out.println("2. Ing Arquitectura y Diseño  ");
                    System.out.println ("Licenciatura en Arquitectura");
                    System.out.println   ("Licenciatura en Periodismo");
                    System.out.println               ("Licenciatura en Diseño de Interiores");
                    System.out.println     ("Licenciatura en Diseño Gráfico");
                    System.out.println ("Licenciatura en Diseño Gráfico con énfasis en Publicidad y Mercadeo");
                    System.out.println ("Licenciatura en Comunicación Audiovisual con énfasis en Producción de Radio y TV");
                    System.out.println("Licenciatura en Publicidad y Mercadeo con énfasis en Imagen Corporativa");

                    break;
                case 3:
                    System.out.println("3. Ciencias de la salud ");
                    System.out.println ("Doctor en Medicina");
                    System.out.println   ("Licenciatura en Enfermeria");
                    System.out.println               ("Licenciatura en Nutricion y Dieta");
                    System.out.println     ("Doctor en cirugia Dental");
                    System.out.println ("Licenciatura en Pedagogia");
                    System.out.println ("Licenciatura en Farmacia");

                    break;
                case 4:
                    System.out.println("4. Derecho y Ciencias Politicas");
                    System.out.println ("Licenciatura en Derecho");
                    System.out.println   ("Licenciatura en Criminologia");

                    break;
                case 5:
                    System.out.println("5. Hoteleria Gastronomia ");
                    System.out.println ("Lic.Internacional en administracion Hotelera");
                    System.out.println   ("Lic. Internacional en artes Culinarias");

                    break;
                case 6:
System.out.println("Salir");
                    break;
                default:
System.out.println("caso no existe");

            }

            return opc;
        }
}



