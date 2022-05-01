import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double v, at, al, a, h, l;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("ancho: ");
a=it.nextDouble();
System.out.print("altura: ");
h=it.nextDouble();
    System.out.print("largo: ");
l=it.nextDouble();
//proceso
v=a*l*h;
at=2*((a*l)+(l*h)+(a*h));
al=2*((a*l)+(a*h));
//datos de salida
System.out.println("V: "+v);
    System.out.println("At: "+at);
    System.out.println("Al: "+al);
    
  }
  }