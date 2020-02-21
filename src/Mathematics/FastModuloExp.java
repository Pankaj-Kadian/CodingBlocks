package Mathematics;

public class FastModuloExp {
    public static long modulo(long a,long b,long m){
        long ans =1 ;
        while(b>0){
            if((b&1)==1){
                ans = ans*a;
                ans=ans%m;
            }
            a=a*a;
            a=a%m;
            b=b>>1;
            b=b%m;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(modulo(11,2,100));
    }
}
