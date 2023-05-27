public class funciones {
    public static void main(String[] args) {


        holaMundo();
        holaMundo();
        holaNombre("Guillermo");
        DevolverTexto();
    }

    private static void holaMundo() {
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
    }

    private static void holaNombre(String name) {
        System.out.println("Hola "+name);
    }

    private static String DevolverTexto(){
        return "Hola";
    }
}