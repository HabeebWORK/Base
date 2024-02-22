package Base.Operators.Comparision;

import java.util.Scanner;

public class Compar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        //   != 	Not equal

        while (true){

            System.out.println("enter a num");
            int Num1 = input.nextInt();
            System.out.println("enter another num");
            int Num2 = input.nextInt();

            if(Num1 == 0){
                System.out.println("Ending the loop ");
                break;
            } else if (Num1 == Num2){
                System.out.println("yes they are Equal");
            } else {
                System.out.println("No they are not equal");
            }

        };

    }

}

