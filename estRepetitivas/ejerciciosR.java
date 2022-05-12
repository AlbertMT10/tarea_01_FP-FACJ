package estRepetitivas;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

/**
 * ejerciciosR
 */
public class ejerciciosR {

       //crear metodo
       //nunaca debe haber un metodo dentro de un metodo
       public static void imprimirN1_10while() {
           int numInit=1;
           while (numInit<=10) {
                System.out.println(numInit);
                numInit=numInit+1;
           }
           
       }
       public static void imprimirN1_10dowhile() {
           int numInit=10;

        do {

            System.out.println(numInit);
            numInit=numInit+1;
            
        } while (numInit<=20);
           
       }
       public static void imprimirN1_10for() {

           for (int numInit = 20; numInit <=30 ; numInit++) {
            System.out.println(numInit);
               
           }
       }
       //nombrerimprimir
       public static void imprimirNombre() {
           //declarar variable

           String nombre;
           String invert;

           //datos de entrada

           System.out.println("ingrese su nombre");
           Scanner lt=new Scanner(System.in);
           nombre=lt.next();
           System.out.println("ingrese su nombre");
           Scanner lt=new Scanner(System.in);
           nombre=lt.next();


           //datos de salida
           for ( int i = 0; i < nombre.length(); i++) {
               System.out.println(nombre.charAt(i));
               
           }
           for (int i =nombre.length()-1; i>=0; i--) {

            System.out.println(nombre.charAt(i));

               
           }
            
        


           
       }





       public static void main(String[] args) {

        /* System.out.println("While");

           imprimirN1_10while();

        System.out.println("Do While");

        imprimirN1_10dowhile();

        System.out.println("for");
        imprimirN1_10for(); */
        System.out.println("nombre");
        imprimirNombre();
        System.out.println("invertido");



       }

}