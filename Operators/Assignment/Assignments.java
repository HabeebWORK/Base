package Base.Operators.Assignment;

import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number (or '00' to stop): ");
            int num = input.nextInt();

            // Check if the input is '00' to stop the program
            if (num == 0) {
                System.out.println("Stopping the program...");
                break;
            }

            System.out.println("Enter an Assigner: ");
            String assigner = input.next();

            switch (assigner) {
                case "=":
                    num = 4;
                    System.out.println(num);
                    break;

                case "+=":
                    num += 4;
                    System.out.println(num);
                    break;

                case "-=":
                    num -= 4;
                    System.out.println(num);
                    break;

                case "*=":
                    num *= 4;
                    System.out.println(num);
                    break;

                case "/=":
                    num /= 4;
                    System.out.println(num);
                    break;

                case "%=":
                    num %= 4;
                    System.out.println(num);
                    break;

                case "&=":
                    num &= 4;
                    System.out.println(num);
                    break;

                case "|=":
                    num |= 4;
                    System.out.println(num);
                    break;

                case "^=":
                    num ^= 4;
                    System.out.println(num);
                    break;

                case ">>=":
                    num >>= 4;
                    System.out.println(num);
                    break;

                case "<<=":
                    num <<= 4;
                    System.out.println(num);
                    break;

                case "=+":
                    num = +4;
                    System.out.println(num);
                    break;

                default:
                    System.out.println("Nothing is okay");
            }
        }
    }
}
