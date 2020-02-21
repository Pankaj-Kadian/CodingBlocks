package BitMasking;

import java.util.Scanner;

public class PlayingWithBits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            int l = s.nextInt();
            int r = s.nextInt();
            int count=0;
            for(int i=l;i<=r;i++){
                int j = i;
                while(j>0){
                    count = count + (j&1);
                    j=j>>1;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
