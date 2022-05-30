import java.util.Scanner;

/**
 * hamburguesa
 */
public class hamburguesa {

    static Scanner lt=new Scanner(System.in);

        int hamburguesa;
		int n;
		int tarjeta;
		double total=0;
		double x;
        
		System.out.println("Seleccione el numero del tipo de hamburguesa: ");
         n = lt.nextInt();

		for (x=1;x<=n;x++) {
			System.out.println("Seleccione el numero del tipo de hamburguesa: ");
			System.out.println("  1.- S sencilla s/. 10");
			System.out.println("  2.- D doble s/.12");
			System.out.println("  3.- T triples s/.14 ");
			hamburguesa = lt.nextInt();
			switch (hamburguesa) {
			case 1:
				total = total+10;
				break;
			case 2:
				total = total+12;
				break;
			case 3:
				total = total+14;
				break;
			default:
			}
		}
		System.out.println("Elige el tipo de pago:");
		System.out.println("    1.- Efectivo");
		System.out.println("    2.- Tarjeta de credito");
		tarjeta = lt.nextInt();
		switch (tarjeta) {
		case 1:

			System.out.println("El total a pagar es de: "+total+" soles");
			break;

		case 2:

			total = total+(total*.05);
			System.out.println("El total a pagar es de: "+total+" soles");
			break;
            
		default:
        }
    }
}