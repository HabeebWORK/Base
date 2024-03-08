package Base.Conditions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class even_odd_hard {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ENTER A NUM");
            int N = scanner.nextInt();
            int Even = N%2;

            if(Even==0){
                if(N>=6&&N<=20){
                    System.out.println("Even but between 6 to 20");
                }else System.out.println("EVEN In rem ");
            }else System.out.println("its odd");




//            scanner.close();
        }


}
