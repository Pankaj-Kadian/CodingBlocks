package BitMasking;

import java.util.Scanner;

public class XorProfit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int count =0;
        int j = y;
        while(j>0){
            count++;
            j=j>>1;
        }
        int flag = 0;
        int ans =0;
        for(int i=count-1;i>=0;i--){
            if(flag==0){
                int mask = 1<<i;
             //   System.out.println(mask);
                if((x&mask)!=(y&mask)){
                    flag=1;
                    ans=ans+(1<<i);
                }
           //     System.out.println(ans);
            }else{
                ans=ans+(1<<i);
            }
        }
        System.out.println(ans);
    }
}
