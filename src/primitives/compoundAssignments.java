package primitives;

public class compoundAssignments
 {

  public static void main(String[] args) {

   // += -= *= /= %=

   int num1= 7;
   int num2 = num1 + 7;
   num1 += num2;
   System.out.println(num1); //21, 14, 15,16, 7, 35

   num2 -= 8; // num2 = num2 -8;

   System.out.println(num2); //6, - 1


   int num3 = num1 + num2;
   num2 += num3;

   System.out.println(num3);



  }

}
