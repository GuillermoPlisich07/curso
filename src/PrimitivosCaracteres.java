public class PrimitivosCaracteres {
    public static void main(String[] args) {

        var caracter ='\u0040';
        char decimal=64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: "+(decimal == caracter));

        char simbolo = '@';

        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: "+(simbolo == caracter));

        char espacio=' ';
        char espacio2='\u0020';
        char retroceso='\b';
        char tabulador='\t';
        char saltoDeLinea='\n';
        char retornoCarro='\r';



        System.out.println("char corresponde en byte a = " +Character.BYTES);
        System.out.println("char corresponde en bites a  = "+ Character.SIZE);
        System.out.println("Valor maximo de un char = "+ Character.MAX_VALUE);
        System.out.println("Valor maximo de un char = "+ Character.MIN_VALUE);
    }
}
