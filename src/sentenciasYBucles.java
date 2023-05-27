public class sentenciasYBucles {
    public static void main(String[] args) {

        // IF ELSE-IF ELSE
        boolean check = 5 < 10;

        int number1 = 5;
        int number2 = 10;
        int number3 = 20;
        int number4 = 1000;

        if (number1 < number2 && number2 < number3){
            System.out.println("Verdadero");
            System.out.println("Verdadero");
        } else if ( number3 < number4) {
            System.out.println("Else if");
        }else{
            System.out.println("else");
        }

        System.out.println("fin");


        // FOR

        for(int i=0; i <= 10; i++){
            System.out.println("Hola Mundo");
        }
        System.out.println("fin");


        // WHILE

        int count = 0;
        while(count<10){
            System.out.println("Hola Mundo" + count);
            count++;
        }
        System.out.println("fin");






    }
}