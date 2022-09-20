public class UpdatingVariables {
    public static void main(String[] args) {
        //
        // Trabajando con Variables
        //
        int salary = 1000;

        //digamos que gana 1000 y se le dara un bono de 200 -- Formas de hacerlo:
        //salary = 1000 + 200;
        //salary = salary + 200;
        salary += 200;
        System.out.println(salary);

        //digamos que ahora tambien tienen que descontarle 50
        //salary = salary - 50;
        salary -= 50;
        System.out.println(salary);

        //Digamos que trabajo 2 horas xtras y que cada hora xtra es +30
        //A demas utilizo un cupon de comida  -45

        //salary = salary + (30*2) - 45;
        salary += (30*2) - 45;
        System.out.println(salary);

        //
        // Actualizar cadenas de textos
        //

        String employeeName = "Medardo Tejada";

        //Digamos que le falta el segundo apellido
        employeeName = employeeName + " Calderon";
        System.out.println(employeeName);
    }
}
