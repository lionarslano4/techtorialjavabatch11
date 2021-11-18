package primitives;

public class RmainderPractice {
    public static void main(String[] args) {

        // modulus --> % --> remainder (left over after division)


        int number1 = 45;
        int number2 = 6;

        int remainder1 = number1 % number2;

        System.out.println("remander1 is >> " + remainder1);

        // Find  the sum of digits from give number
        // 123 --> 1 + 2 + 3 = 6 ==> sout(sum is >> <sum> )

        //  123 % 10 --> 3
        // 12 % 10 --> 2
        // 1 % 10 --> 1

        int myNumber  = 123;

        int  digit3 = myNumber % 10;

         myNumber = myNumber /10;

         int digit1 = myNumber % 10;

         int digit2 = myNumber % 10;

         myNumber = myNumber/ 10;




         System.out.println(digit1);
         System.out.println(digit2);
        System.out.println(digit3);






    }
}
