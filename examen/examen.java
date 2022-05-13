import java.util.Scanner;

/**
 * examen
 */
public class examen {

    static Scanner lt = new Scanner(System,in);

    /* Diseñe un algoritmo que permita determinar el nivel del perfil de ingreso de un postulante con la
que obtiene una vacante a la carrera de ingeniería de Sistemas; considerando que, si su nota es mayor
o igual a 17 su nivel es 4, si la nota es menor de 17 y mayor o igual a 14 su nivel es 3, si su nota es
menor a 14 y mayor o igual a 11 su nivel es 2; mientras que si su nota es menor de 11 ya no puede
obtener la vacante y por ende también está en el nivel 1.
Considera que la nota final es vigesimal según el siguiente ponderado:
Examen de conocimiento 40%
Entrevista Personal 35%
Test Psicológico 25% */

    public static void pregunta1exFACJ() {

        //declarar variables

        String Nl;
        double Nec, NE, Ntp; 

        //datos de entrada

        System.out.println("Ingrese las notas: ");
        System.out.println("Ingrese la nota del Examen de Conocimiento");
        Nec=lt.nextDouble();
        System.out.println("Ingrese la nota de la Entrevista Personal");
        NE=lt.nextDouble();
        System.out.println("Ingrese la nota del Test Psicologico");
        Ntp=lt.nextDouble();
    
        //Proceso
    
        double PEC = (Nec * 0.40);
        double PEP = (NE * 0.35);
        double PTP = (Ntp * 0.25);
        double promedio = (PEC + PEP + PTP);
    
        if (promedio>=17 && promedio<=20) {
            Nl="Su nivel es 4";
        } else if(promedio<17 && promedio>=14){
            Nl="Su nivel es 3";
        } else if(promedio<14 && promedio>=11){
            Nl="Su nivel es 2";
        } else if(promedio<11){
            Nl="usted No puede obtener vacante";
        } else {
            Nl="Notas no validas ";
        }
        // Datos de Salida
        System.out.println(Nl);
    
            
        }

        /* 2.-Tiendas Plaza Norte desea un programa que permita calcular el IVG de la venta de sus artefactos
además desea hacer un descuento de 10% cuando el monto base de venta supera los 2000 soles,
mientras que si el monto supera los 1000 desea hacer un descuento del 5% Y si supera los 500 soles
realiza un descuento del 2%, El algoritmo debe permitir calcular el IGV, el descuento y el monto total
a pagar */

        public static void pregunta2exFACJ() {

            // declarar variables

            double igv, precio, descuento, importetotal;

            //datos de entrada

            System.out.println("ingrese el monto base: ");
            precio = lt.nextDouble();
            igv = precio+0.18 ;

            //proceso
            
            if (precio<2000){
                igv = precio*0.18;
                descuento = precio*0.10;
                importetotal = precio - descuento + igv ;
                
            }else  if (precio>1000){
                    igv = precio*0.18;
                    descuento = precio*0.05;
                    importetotal = precio - descuento + igv ;
                }else if (precio>500){
                    igv = precio*0.18;
                    descuento = precio*0.02;
                    importetotal = precio - descuento + igv ;
                }else{ 
                        descuento = 0;
                        importetotal =0;
                    
                }

                //datos de salida
                
                System.out.println("el descuento aplicado es: "+ descuento);
                System.out.println("el igv es: "+ igv);
                System.out.println("el importe total es de : "+ importetotal);
            
            
        }

        /* 3.-Diseñar un algoritmo que permita calcular una operación aritmética entre 2 valores introducidos y
el signo correspondiente por teclado: si es el signo es + debe realizar una suma, si es el signo – debe
realizar la resta, si es el signo / debe realizar la división, si es el signo * debe realizar la multiplicación,
si es el signo ^ debe calcular la potencia; por otro lado, si introduce R debe permitir calcular la raíz
cuadrada de un número, si introduce % debe permitir calcular el módulo de 2. */

        public static void pregunta3exFACJ() {

            //deffinir

            int v1, v2;
            double R;

            //datos de entrada

            System.out.print("ingrese el primer valor: ");
            v1 = lt.nextInt();
            System.out.print("ingrese el segundo valor: ");
            v2 = lt.nextInt();
            char operador=lt.next().charAt(0);
            R = Math.sqrt(v1);

            //proceso
        
            switch (operador){
                
                case '+': System.out.println(v1+v2); break;
                case '-': System.out.println(v1-v2); break;
                case '/': System.out.println(v1/v2); break;
                case 'x': System.out.println(v1*v2); break;
                case '%': System.out.println(v1%2); break;
                case '^': System.out.println(v1^v2); break;
                case 'R': System.out.println(+R); break;
                
                default: break;
            }
        }

        /* 4.-Secretaría de salud requiere un algoritmo que permita determinar qué tipo de vacuna (A, B o C)
aplicar a una persona, considerando que, si es mayor de 70, sin importar el sexo, se le aplica el tipo C;
si tiene entre 16 y 69 años, y es mujer se le aplica el tipo B, y si es hombre, la A; sí es menor de 16
años, se aplica el tipo A sin importar el sexo. */


public static void pregunta4exFACJ() {

    //deffinir

    int edad;
    String sexo;
    String vacuna; 

    //Datos de Entrada

    System.out.print("Ingrese la edad del paciente:");
    edad=lt.nextInt();

    //Proceso
    
    if (edad>69) {
        vacuna="La vacuna que le corresponde es C";
    }else if(edad>16){
        System.out.println("Ingrese el sexo (F=femenino y M=masculino)");
        sexo=lt.next();
        vacuna="La vacuna que le corresponde es B"; 
    } else if(edad<16){
        vacuna="La vacuna que le corresponde es A";
    } else {
        vacuna="La vacuna que le corresponde es  A";
    }    
    
    System.out.println(vacuna);
}

   /*5 .-Realice un algoritmo que permita probar uno de los 3 algoritmos que ha diseñado anteriormente
aplicando una estructura condicional múltiple o algo similar, y las estructuras de control que se
requieran para tal fin */

public static void main(String[] args) {
    
    System.out.println("Ingrese la pregunta");
    int pregunta = lt.nextInt();
    switch (pregunta) {
      case 1:
        pregunta1exFACJ(); break;
      case 2:
        pregunta2exFACJ(); break;
      case 3:
        pregunta3exFACJ(); break;
      case 4:
        pregunta4exFACJ(); break;
        
        default: break;
    }
}
        
    }
