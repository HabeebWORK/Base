package Base.Algorithm;

public class Search_range {
    public static void main(String[] args) {
        int[] Nums = {11,22,33,44,55,66,77,88,99,001};

        int Start = 2;
        int stop = 8;
        int Target = 55;

        System.out.println(Function_Range(Nums,Start,stop,Target));

    }

    public static int Function_Range (int[] Nums,int Start, int Stop,int Target){
        if (Nums.length==0){
            return -1;
        }


        for (int index=Start; index<Stop;index++){
            int elements = Nums[index];
            if (elements==Target){
                System.out.println("Target found ");
                return index;
            }
        }
        return -1;
    }
}
