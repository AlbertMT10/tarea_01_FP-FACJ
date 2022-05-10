class ejercicios_repetitivas {
    
    //metodos


    public static void ejer41While() {
        //generalmente es contador=0
        int contador=1;

        while (contador<=20) {
            //como saber si es par o impar
            if (contador%2==0) {

                suma=suma+contador;
            }
            contador++;
        }

        System.out.println("la respuesta es:" +suma);
    }

    public static void main(String[] args) {
        //no te olvides 
        ejer41While();
    }
}