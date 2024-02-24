package Base.Strings;

import java.util.Scanner;

public class occurrences {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println(" Enter some stuff :");
        String Input1 = Input.nextLine();
        System.out.println(" Enter char to check whrther the char is present in stiff or not ");



         while (true){

             String Input2 = Input.nextLine();
             char stuffer = Input2.charAt(0);
             if (Input2.length()  == 1  ){
                 count(Input1,stuffer);
                 break;
             }else {
                 System.out.println("the length is too big // Enter only one char");
             }

         }

    }

    public static void count (String a,char b) {
        int C = 0;

        for(int i = 0; i < a.length(); i++ ){
           char stuff = a.charAt(i);
            if(stuff == b){
               C++;
            }
        }
        System.out.println("Yess we found you - we are luckey to have you again -- " + C + "times");
    }
}
