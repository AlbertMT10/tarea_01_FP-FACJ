import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double ph, ch, c;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("ingrese cantidad de metros cuadrados a pintar: ");
ph=it.nextDouble();
System.out.print("precio por metro cuadrado:$ ");
ch=it.nextDouble();
//proceso
c=ph*ch;
  
//datos de salida
System.out.println("costo:$ "+c);
    
  }
  }