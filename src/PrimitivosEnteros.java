public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 7;

        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte " + Byte.MIN_VALUE);

        short numeroShort= 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo Short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo Short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor maximo de un Short " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un Short " + Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maximo de un int " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int " + Integer.MIN_VALUE);


        long numeroLong = 9223372036854775807L;
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor maximo de un long " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long " + Long.MIN_VALUE);


        var numeroVar= 127; //Entero por default
        var numeroVarLong= 9223372036854775808f; //Se puede cambiar






    }
}
