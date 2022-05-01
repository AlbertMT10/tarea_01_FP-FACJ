import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
    double p,r=4,i;
    Scanner lt=new Scanner(System.in);
      System.out.println("ingrese el valor de la intensidad:");
    i=lt.nextDouble();
    p=r*Math.pow(i,2);
      System.out.println("la potencia es:" +p);
  }
}