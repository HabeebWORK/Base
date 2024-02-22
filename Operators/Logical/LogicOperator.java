package Base.Operators.Logical;

import java.util.Scanner;

public class LogicOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("num1 :");
            int num1 = input.nextInt();
            System.out.println("num2 :");
            int num2 = input.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("YEs both are unlocked with '0' ");
                break;
            } else {
                System.out.println("its not cool");
            }
        }





        while (true) {
            System.out.println("Number :");
            int Number = input.nextInt();
            System.out.println("Digits :");
            int Digits = input.nextInt();

            if (Number == 0 || Digits == 0) {
                System.out.println("YEs some one is unlocked with '0' ");
                break;
            } else {
                System.out.println("its not cool");
            }
        }




        while (true) {
            System.out.println("Boom for :");
            int Boom = input.nextInt();
            System.out.println("Digits on top :");
            int Top = input.nextInt();

            if (!(Boom==Top)) {
                System.out.println(" checking equality ");
                break;
            } else {
                System.out.println("its not cool");
            }
        }


    }
}
