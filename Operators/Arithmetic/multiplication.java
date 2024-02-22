package Base.Operators.Arithmetic;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num1 = input.nextInt();
        System.out.println("Enter another number to multiple :");
        int num2 = input.nextInt();

        int multi = num1 * num2;
        System.out.println("Value is :"+ multi);



    }
}
