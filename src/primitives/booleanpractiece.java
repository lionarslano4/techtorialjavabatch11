package primitives;

public class booleanpractiece {


    public static void main(String[] args) {
        boolean isHungry = true;
        System.out.println(isHungry);

        boolean isLightOn = false;
        System.out.println(isLightOn);

        System.out.println(true);

        System.out.println(isHungry == isLightOn);

        isLightOn =isHungry;
        isLightOn= false;

        System.out.println(" last version is " +isHungry); //true
        System.out.println("last version is light " +isLightOn); // fales



    }
}
