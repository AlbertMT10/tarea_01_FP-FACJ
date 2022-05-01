import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double t, c, m;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("duracion de la llamada en minutos: ");
m=it.nextDouble();
System.out.print("costo por minuto:$ ");
c=it.nextDouble();
//proceso
t=c*m;
  
//datos de salida
System.out.println("conto de llamada:$ "+t);
    
  }
  }