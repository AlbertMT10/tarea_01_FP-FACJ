import java.util.Scanner;

/**
 * trabajo04
 */
public class trabajo04 {

    static Scanner lt=new Scanner(System.in);
    static BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void ejercicioFACJ() {
        double i;
		double SI;
		double SR;
		double año;
		for (i=1;i<=6;i++) {
			System.out.println(+i);
			SI = 1500;
			año = i;
			SR = SI*Math.pow((1.1),(año));
			System.out.println("Salario inicial: "+SI);
			System.out.println("Salario del año: "+SR);
			System.out.println("año: "+año);
		
        }
    }
    public static void main(String[] args) {


        ejercicioFACJ();
        
    }
}