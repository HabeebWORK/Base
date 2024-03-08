package Base.Strings;

import java.util.Scanner;

public class R_space {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replace(" ", "");
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);




//
//        System.out.println(str); // Output: "Hello   World"
    }





}
