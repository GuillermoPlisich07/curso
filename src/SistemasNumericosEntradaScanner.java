
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        //String numeroStr= scanner.nextLine();
        int numeroDecimal=0;
        try{
            numeroDecimal=scanner.nextInt();
            //numeroDecimal=Integer.parseInt(numeroStr);
        }catch(NumberFormatException e){
            System.out.println("Erro debe ingresar un mensaje entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario="numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        //System.out.println(resultadoBinario);
        //int numeroBinario = 0b111110100;
        //System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal="numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        //System.out.println(resultadoOctal);
        //int numeroOctal = 0764;
        //System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex="numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        //System.out.println(resultadoHex);
        //int numeroHex = 0x1f4;
        //System.out.println("numeroOctal = " + numeroHex);

        String mensaje=resultadoBinario;
        mensaje+="\n"+resultadoOctal;
        mensaje+="\n"+resultadoHex;

        System.out.println(mensaje);
    }
}
