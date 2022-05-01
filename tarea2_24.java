import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double h, m, s, hh;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("ingrese la hora ejempo 1:00 // 1.0: ");
hh=it.nextDouble();

//proceso
h=hh*1;
  m=hh*60;
    s=hh*3600;
  
//datos de salida
System.out.println("hora: "+h);
    System.out.println("minutos: "+m);
    System.out.println("segundos: "+s);
    
  }
  }