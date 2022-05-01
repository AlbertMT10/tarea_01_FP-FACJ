import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double ac, an, e;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("año de nacimiento: ");
an=it.nextDouble();
System.out.print("año actual: ");
ac=it.nextDouble();
//proceso
e=ac-an;
  
//datos de salida
System.out.println("edad actual: "+e);
    
  }
  }