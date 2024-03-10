package Base.Algorithm;

public class Search_Min {
    public static void main(String[] args) {
        int[] Nums = {11,22,33,44,55,66,77,88,99};

        System.out.println(Min(Nums));
    }

    public static int Min(int[] Arr){
        int Ans= Arr[0];
        for(int i=0; i<Arr.length;i++){
           if (Ans > Arr[i]){
               Ans = Arr[i];
           }

        }
        return Ans;
    }

}
