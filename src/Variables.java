public class Variables {
    public static void main(String[] args) {

        // tipo identificador = 30;
        // tipo identificador;
        // identificador = 30;

        // Enteros
        byte number1 = 1; // 1 byte
        short number2 = 2; // 2 byte
        int number3 = 3; // 4 byte
        long number4 = 4L; // 8 byte


        // Punto Flotante
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;

        // Caracteres
        char caracter1 = 'a';

        // Booleanos
        boolean verdadero= true;
        boolean falso = false;

        //Cadenas de Texto
        String nombre = "Guillermo";
        String apellido = "Plisich";


        //Tipo Envoltorio
        Integer numero = null;
        Long numero2 = 2L;


        // Variable String
        String saludar="Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        //Variable int
        int numero10=10;
        System.out.println("numero = " + numero10);

        //Variable Booleana
        boolean valor = true;

        int numero5=5;

        if(valor){
            System.out.println("numero = " + numero10);
            numero10 = 10;
        }
        System.out.println("numero5 = " + numero5);

        var numero3 = "15"; //FORMA DINÁMICA DE VARIABLE ESTILO JAVASCRIPT

        String nombre2;

        nombre2 = "Andrés";

        if(numero10 > 9){
            nombre2="Juan";
        }

        System.out.println("nombre2 = " + nombre2);

        int edadPersona=5;






    }
}
