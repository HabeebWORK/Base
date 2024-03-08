package Base.Strings;

import java.util.Scanner;

public class Longest_prefix {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size of a array riquid for you :");
        int iSize = input.nextInt();
        int jSize = input.nextInt();
        String[][] Names = new String[iSize][jSize];

     for(int i=0;i<iSize;i++){
         for (int j=0;j<jSize;j++){
             Names[i][j] = input.next();
         }
     }

        for(int i=0;i<iSize;i++){
            System.out.print(Names[i] + " ");
        }
    }
}
//
//        for(int i = 0; i<Size; i++){
//
//            System.out.println("Enter names :");
//            Names[i] = input.nextLine();
//        }