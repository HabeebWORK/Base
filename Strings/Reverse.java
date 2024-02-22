package Base.Strings;

//Write a Java program to reverse a given string.

import java.util.Scanner;

public class Reverse {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("Enter a string to reverse:");
                String str = input.next();
                if(str.equals("0")){
                    System.out.println("I am getting out of this - i dont want any ");
                    break;
                }
                int iii = str.length() - 1;
                String rev = "";
                for (int i = iii; i >= 0; i--) {
                rev += str.charAt(i);
                }

                System.out.println("Reversed string: " + rev);

            }
        }



}
