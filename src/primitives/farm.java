package primitives;

public class farm {
    public static void main(String[] args) {


        // in a from, there are 12  cows and 23 chicken
        // 1- find the total legs of the animals in the farm and print out
        // 2- if each cow costs $ 2345 and each chicken  costs $23.99
        // find the total worth of these animals and print out

        int chicken = 23;
        int cow = 12;



        int totaleg = (chicken * 2 ) + (cow * 4 );
        System.out.println("total number of the legs in the farm is " + totaleg);



        double cow$ = 2345;
        double chicken$ = 23.99;

        double total$ = cow * cow$ + chicken * chicken$;
        System.out.println("the total worth of the animals is " + total$);
        System.out.println(cow * cow$ + chicken * chicken$);






    }

}
