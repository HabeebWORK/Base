package Base.Operators.Arithmetic;

import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number :");
        int num1 = input.nextInt();
        System.out.println("Enter a number :");
        int num2 = input.nextInt();

      int sub = num1-num2;
        System.out.println("value = "+sub);

    }
}
