import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double k, c, cf;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("kilometro recorridos: ");
k=it.nextDouble();
System.out.print("costo por kilometro:$ ");
c=it.nextDouble();
//proceso
cf=c*k;
  
//datos de salida
System.out.println("precio del recorrido:$ "+cf);
    
  }
  }