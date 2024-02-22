package Base.Operators.Arithmetic;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num1 = input.nextInt();
        System.out.println("Enter another number to divide :");
        int num2 = input.nextInt();

        int div = num1 / num2;
        System.out.println("Value is :"+ div);


    }
}
