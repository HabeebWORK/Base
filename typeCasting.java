import java.util.Scanner;

public class typeCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Widening Casting");
        //  Widening Casting
        //  type conversion || type casting

        System.out.println("Enter int :");
        int num = input.nextInt();

        //        type casting float to int

        double numNext = num;

        System.out.println("Num :"+ num);
        System.out.println("numNext :"+ numNext);



        //  Narrowing Casting
        //  type conversion || type casting

        System.out.println("Narrowing Casting");

        System.out.println("Enter double :");
        float myDouble = input.nextFloat();
        int myInt = (int) myDouble;

        //        type casting float to int


        System.out.println("Num :"+ myDouble);
        System.out.println("numNext :"+ myInt);

    }
}
