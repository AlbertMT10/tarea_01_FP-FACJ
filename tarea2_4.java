import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double ph, ch, c;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("precio por hora:$ ");
ph=it.nextDouble();
System.out.print("cantidad de horas: ");
ch=it.nextDouble();
//proceso
c=ph*ch;
  
//datos de salida
System.out.println("costo:$ "+c);
    
  }
  }