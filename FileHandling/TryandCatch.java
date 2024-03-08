package Base.FileHandling;

import java.util.Scanner;

public class TryandCatch {
    public static void main(String[] args) {


//        try and catch

        try {
            int I = Integer.parseInt("Hello");
        }catch (Exception e){
            System.out.println("Hello i gess you are out of your mind Andhrass😂😂");
        }

        System.out.println("Hello Enter some Stuff");
        Scanner in = new Scanner(System.in);




        try {
            int Name = in.nextInt();
        }catch (Exception e){
            System.out.println("YOU HAVE TO ENTER A NUMBER ");
        }



    }
}
