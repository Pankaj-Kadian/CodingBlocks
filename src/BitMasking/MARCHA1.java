package BitMasking;

public class MARCHA1 {
    //CodeChefProblem
    public static boolean result(int[] coins,int m){
        boolean ans = false;
        for(int i=0;i<(1<<coins.length);i++){
            int sum=0;
            int j=i;
            int k = coins.length-1;
            while(k>=0){
                int mask=1<<k;
                if((i&mask)!=0){
                    sum=sum+coins[coins.length-1-k];
                }
                k--;
            }
            if(sum==m){
                return true;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        while(t>0){
            int n = s.nextInt();
            int m = s.nextInt();
            int[] coins = new int[n];
            for(int i =0;i<n;i++){
                coins[i]=s.nextInt();
            }
            if(result(coins,m)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            t--;
        }
    }
}
