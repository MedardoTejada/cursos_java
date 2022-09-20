        // Se utiliza convencion de CamelCase
public class NamingJava {
    public static void main(String[] args) {
        int cellphone = 3333777;
        System.out.println(cellphone);

        String $countryName = "Panama";
        String _provincia = "Herrera";

        System.out.println($countryName + ", " + _provincia);

        // mayuscula cerrada y si son varias palabras separarlas con guion bajo, esta es la nomenclatura para constantes (claro, aun falta la palabra reservada que lo haga constante)
        int POSITION = -5;
        int MAX_WIDTH = 999;
        int MIN_WIDTH = 1;

        //Lower Camel Case
        String fullName = "Medardo Tejada Calderon";
        int sizeInCentimeters = 50;
    }
}
