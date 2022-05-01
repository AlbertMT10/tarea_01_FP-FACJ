import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double s, d, r;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("Ingrese cantidad de soles :s/. ");
s=it.nextDouble();
System.out.print("Ingrese valor del dolar:$ ");
d=it.nextDouble();
//proceso
r=s*d;
  
//datos de salida
System.out.println("cantidad de dolares:$ "+r);
    
  }
  }