package BitMasking;

public class TavasAndSaddas {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int count=0;
        int ans=0;
        int sec=n;
        while(sec>0){
            if(sec%10==7){
                ans=ans+(1<<count);
            }
            count++;
            sec=sec/10;
        }
        count--;
        while(count>0){
            ans = ans + (1<<count);
            count--;
        }
        System.out.println(ans+1);
    }
}
