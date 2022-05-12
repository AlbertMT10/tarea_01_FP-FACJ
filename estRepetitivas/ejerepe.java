import java.util.Scanner;

/**
 * ejerepe
 */
public class ejerepe {

static Scanner lt=new Scanner(System.in);
  public static void ejer41While() {
      
  }
  public static void pregunta2DMP() {
      System.out.println("ingrese el operador: ");
      char operador=lt.next().charAt(0);
      switch (operador) {
          case '+': System.out.println("debes sumar"); break;
          case '%': System.out.println("debes sacr el modulo"); break;
      
          default: break;
      }
  }
  public static void main(String[] args) {
      pregunta2DMP();
      
  }

}