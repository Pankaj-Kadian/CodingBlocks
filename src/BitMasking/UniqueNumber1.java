package BitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UniqueNumber1 {
    //The idea is to xor so the same element will contribute 0 and the only Non repeating element will be remaining
    // 0^x = x
    // 1^x = ~x
    public static void main(String[] args){
        FastReader s = new FastReader();
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int ans =arr[0];
        for(int i=1;i<n;i++){
            ans=ans^arr[i];
        }
        System.out.println("Ans is "+ans);
    }
}
