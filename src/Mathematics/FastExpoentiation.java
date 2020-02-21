package Mathematics;

public class FastExpoentiation {
    // Fast exponetiation means a raise to power b
    // Recusrion method will be optimised to have a time complexity of log b space complexity also log b
    public static long powerRecursion(long a, long b){
        if(b==0){
            return 1;
        }
        long ans= powerRecursion(a,b/2);
        if(b%2==0){
            return  ans*ans;
        }
        return ans*ans*a;
    }
    // Bit method will have a time complexity log b that is no of bits in b and space complexity O(1)
    public static long powerBits(long a,long b){
        long ans =1;
        while(b>0){
            if((b&1)==1){
                ans=ans*a;
            }
            a=a*a;
            b=b>>1;
        }
        return ans;
    }
    public static void main(String[] argv){
        System.out.println(powerRecursion(102,23));
        System.out.println(powerBits(102,23));
    }
}
