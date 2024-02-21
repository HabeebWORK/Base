package Base.Arithmetic;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num1 = input.nextInt();
        System.out.println("Enter another number to add ");
        int num2 = input.nextInt();

        int num3 = num1+num2;
        System.out.println(num3);

    }
}
