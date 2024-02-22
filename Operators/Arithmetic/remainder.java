package Base.Operators.Arithmetic;

import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num1 = input.nextInt();
        System.out.println("Enter another number to get remainder :");
        int num2 = input.nextInt();

        int rem = num1 % num2;
        System.out.println("Value is :"+ rem);


    }
}
