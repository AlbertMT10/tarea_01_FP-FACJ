import java.util.*;

class Main {
  public static void main(String[] args) {
    double base, altura, resultado;
    Scanner obj = new Scanner(System.in);
    System.out.print("I: ");
    base = obj.nextDouble();
    System.out.print("Ingrese altura: ");
    altura = obj.nextDouble();
    System.out.print("ingrese base: ");
    resultado = ((base * altura) / 2);

    System.out.println("el area de un triangulo es:: " + resultado);
  }
}