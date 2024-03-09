package Base.Algorithm;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Linear_Search {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int[] Nums = {11,22,33,44,55,66,77,88,99};


//        System.out.println("Enter 10 digits to store in array :");
        for(int i=0; i<Nums.length;i++){
//             Nums[i] = Input.nextInt();
            System.out.print(Nums[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println("Enter target to find :");
        int Target = Input.nextInt();


        int Ans = LeanearSearch(Nums,Target);
        System.out.println(Ans);

    }



//    i am writing a function of leanear search algo
     static int LeanearSearch(int[] Arr,int Target) {

        if(Arr.length == 0){
            System.out.println("No Array Found");
            return -1;
        }

        for(int index = 0;index<Arr.length;index++ ){
            int element = Arr[index];
            if (element==Target){
                return index;
            }

        }

         return -1;

}
}
