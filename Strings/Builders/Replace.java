package Base.Strings.Builders;

import java.util.Scanner;

public class Replace {
//    StringBuilder sb=new StringBuilder ("hello");
//        sb.reverse();
//        System.out.println(sb);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
        String Name = input.nextLine();

        StringBuilder str = new StringBuilder(Name);
        System.out.println("you entered "+str);
        System.out.println(str);
        System.out.println("Which index value of string have to chainge :");
        int Index = input.nextInt();
        System.out.println("Which value have to be placed :");
        String Replacer = input.next();
        char Rvalue = Replacer.charAt(0);
        str.setCharAt(Index, Rvalue);
        System.out.println(str);





    }




}
