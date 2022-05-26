public class persona {
    String nombre="Ruben";
    String DNI;
    int edad;
    char genero;

    public void comer(String alimento) {
        System.out.println(nombre+"comer"+alimento);
    }
    public void documento(String dni) {
        System.out.println(nombre+"su numero de DNI es"+dni);
    }

    public void estudiar(String curso) {
        System.out.println(nombre+"estudia el curso de"+curso);
        
    }
}
