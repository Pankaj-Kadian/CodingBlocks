package BitMasking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NotSoEasyMath {
    public static int countDigit(int j){
        int count=0;
        while(j>0){
            count++;
            j=j>>1;
        }
        return count;
    }
    public static ArrayList<Long> subSeq(long arr[]){
        ArrayList<Long> ans = new ArrayList<>();
        for(int i=1;i<(1<<arr.length);i++){
            int j=i;
            int count = countDigit(i);
            int index=0;
            long value=1;
            while(j>0 && index<arr.length){
                if((j&1)==1){
                    value=value*arr[index];
                }
                j=j>>1;
                index++;
            }
            ans.add(value);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            long n = s.nextLong();
            long ans2 = 0;
            ans2 = n / 2 + n / 3 + n / 5 + n / 7 + n / 11 + n / 13 + n / 17 + n / 19;
            long[] arr = new long[]{2, 3, 5,7,11,13,17,19};
            HashMap<Long,Integer> hash = new HashMap<>();
            for(int i=0;i<arr.length;i++){
                hash.put(arr[i],1);
            }
            ArrayList<Long> ans = subSeq(arr);
            for(int i=0;i<ans.size();i++){
                if(!hash.containsKey(ans.get(i)) && n>=ans.get(i)){
                    ans2=ans2-n/ans.get(i);
                }

            }
            System.out.println(ans2);
            t--;
        }
    }
}
