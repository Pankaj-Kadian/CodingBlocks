package Mathematics;

import java.util.Scanner;

public class DivisibleSub {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int K = s.nextInt();
        int[] freq = new int[K];
        freq[0]=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            int mod = (sum+K)%K;
            mod=mod+K;
            mod=mod%K;
            freq[mod]++;
        }
        int ans = 0;
        for(int i=0;i<K;i++){
            ans += freq[i]*(freq[i]-1)/2;
        }
        System.out.println(ans);
    }
}
