import java.util.Scanner;

/**
 * ejercicioCondMult
 */
public class ejercicioCondMult {

    // ctrl + barra espaciadora  /pu/

    public static void profesor() {
        System.out.println("la funcion del docente es enseñar");
        
    }
public static void estudiante() {
    System.out.println("la funcion del estudiante es aprender");
    
}
public void maquinaPc() {
    System.out.println("funcion de la pc es procesar informacion");
    
}
public void proyector() {
    System.out.println("proyectar una imagen, informacion");
    
}

    public static void main(String[] args) {
        //llamar solo a static no esposible llamar si no esta en estatic
        //ctrl + __ 
        //profesor();
       //estudiante();
        
        //crear un objeto en programacio
        //en una instancia de un clase
        //como se hace?
        // llamar alos que no estan en estatic

        //copiar + objx=new
        ejercicioCondMult objx=new ejercicioCondMult();

        Scanner lt=new Scanner(System.in);
        //alt+92=\
        //""+""
        System.out.println("ingrese el algoritmo que desea probar\n1=profesor"+
        "\n2=estudiante\n3=maquina\n4proyector");
        
        int opcMet=lt.nextInt();

        //ctrl + barra espaciadora
        //objx.maquinaPc();

        //significado

        //condicion key
        //evaluar value

        //switch (key) {
        switch (opcMet) {
            //case value:
            case 1:profesor(); break;
            case 2:estudiante(); break;
            case 3:objx.maquinaPc();; break;
            case 4:objx.proyector();; break;
        
            default: System.out.println("opcion no existe"); break;
        }


        
    }   
}