
import java.util.Scanner;

import javax.swing.text.Document;

/**
 * ClaseGeneral
 */
public class ClaseGeneral {

    static Scanner lt=new Scanner(System.in);

    static aritmrtica obj=new aritmrtica();

    static persona per=new persona();


    public static void main(String[] args) {
        /*System.out.println("Ingrese el Primer Valor:");
        int aX=lt.nextInt();
        System.out.println("Ingrese el Segundo Valor:");
        int bX=lt.nextInt();        
        int result=obj.sumar(aX, bX);
        System.out.println("La Suma es:"+result);*/
        System.out.println("ingrese su nombre:");
        per.nombre=lt.next();

        System.out.println("ingrese su DNI:");
        per.documento(lt.next());

        System.out.println("ingrese una comida:");
        per.comer(lt.next());
    }
}