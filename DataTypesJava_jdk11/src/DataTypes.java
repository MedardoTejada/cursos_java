public class DataTypes {
    public static void main(String[] args) {

        int n = 1234567890;
        // con integer solo puede almacenar hasta 10 digitos
        // por lo que, en los casos que se requiera utilizar mas de 10 caracteres, se puede usar el tipo de variable long, importante colocar una "L" mayuscula al final de los digitos
        long numeroLong = 12345678901L;

        //en caso de decimal podremos utilizar double si se requiere de algo bien preciso
        // o float si no tiene que ser tan preciso, solo que hay que colocar al final la "F" mayuscula
        double numeroDouble = 123.45623232323;
        float numeroFloat = 123.456F;

        // comillas dobles son para String, comillas simples para char y con los char solamente podemos colocar un elemento

        // A partir de JAVA 10, se puede usar solamente Var, y se entendera que tipo de variable es
        var var_n = 1234567890;
        long var_numeroLong = 12345678901L;
        double var_numeroDouble = 123.45623232323;
        float var_numeroFloat = 123.456F;

    }
}
