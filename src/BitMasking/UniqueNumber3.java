package BitMasking;

import java.util.HashMap;

public class UniqueNumber3 {
    public  static  int singleNumber(int[] nums) {
        int result = 0;
        int[] sumByBit = new int[32];

        for (int i = 0; i < 32; i++) {
            for (int element : nums) {
                sumByBit[i] = sumByBit[i] + (element >> i & 1);
            }
            sumByBit[i] = sumByBit[i] % 3;
        }

        for (int i = 0; i < 32 ; i++) {
            result = result + (sumByBit[i] << i);
        }

        return result;
    }
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(singleNumber(arr));
    }
}
