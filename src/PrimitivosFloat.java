public class PrimitivosFloat {

    public static void main(String[] args) {

        float realFloat = 2.12e3f; //2120f ;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = "+ Float.BYTES);
        System.out.println("float corresponde en bites a  = "+ Float.SIZE);
        System.out.println("Valor maximo de un longa = "+ Float.MAX_VALUE);
        System.out.println("Valor maximo de un long = "+ Float.MIN_VALUE);

        double realDouble = 3.4028234E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = "+ Double.BYTES);
        System.out.println("double corresponde en bites a  = "+ Double.SIZE);
        System.out.println("Valor maximo de un double = "+ Double.MAX_VALUE);
        System.out.println("Valor maximo de un double = "+ Double.MIN_VALUE);

        var varFlotante = 3.1416;

        System.out.println("varFlotante = " + varFlotante);

    }
}
