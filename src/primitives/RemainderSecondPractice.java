package primitives;

public class RemainderSecondPractice {
    public static void main(String[] arg) {
        // find the product  of digits from given number
        // 456 ==>  4 * 5 * 6 = 120 sout(" The product is= "+<


        int a = 4;
        int b = 5;
        int c = 6;

        int a1 = 4*5*6;


        System.out.println("the product is " + a1);



        int num = 456;

        int d1 = num%10;

        num = num / 10;

        int d2 = num % 10;

        num = num / 10;

        int d3 = num % 10;

        int product = d1 * d2 * d3;

        System.out.println("the product is = " + (d1 * d2 * d3));

        System.out.println("the product is =" + product);






    }
}
