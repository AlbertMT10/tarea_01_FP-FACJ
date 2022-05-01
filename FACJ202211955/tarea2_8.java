import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double t, d, v;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("distancia en kilometros: ");
d=it.nextDouble();
System.out.print("velociadad k/h: ");
v=it.nextDouble();
//proceso
t=d/v;
  
//datos de salida
System.out.println("tempo de llegada: "+t);
    
  }
  }