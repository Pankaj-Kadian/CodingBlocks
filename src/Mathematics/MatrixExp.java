package Mathematics;

public class MatrixExp {
    // The problems related to linear rec can be solved using Matrix exp
    // Fib no Recursion O(2^n)
    //        DP O(N)
    //        Matrix Exp O(K^3 log n)  k is the size of matrix
    // For n = 10^18 DP will also fail
    public static long[][] multiply(long[][] A,long[][] B){
        int l = A.length;
        long C[][] = new long[l][l];
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                for(int k=0;k<l;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        return C;
    }
    public static long[][] power(long[][] T,long n){
        if(n==1){
            return T;
        }
        long[][] ans = new long[T.length][T.length];
        ans[0][0]=1;
        ans[1][1]=1;
        while(n>0){
            if((n&1)==1){
                ans=multiply(ans,T);
            }
            T=multiply(T,T);
            n=n>>1;
        }
        return ans;
    }
    public static long fib(long n){
        // Lets create the F0 matrix first ans f(n) = f(n-1) + f(n-2)
        // F0 is of size K*1 as in this case K is 2 as f(n) depends on 2 terms
        // f(0)=0; f(1)=1 f(2) =1 f(3) =2
        int k =2;
        long[][] F0 = new long[k][1];
        F0[0][0]=0;
        F0[1][0]=1;
        // Transportation matrix it is very important step
        long[][] T = new long[k][k];
        for(int i=0,j=1;i<k-1;i++){
            T[i][j]=1;
            j++;
        }
        T[k-1][0]=1;
        T[k-1][1]=1;
        // Multiplication of Transportation matrix m times so overall complexity decreases
        long[][] ans = power(T,n-1);
     //   ans= multiply(ans,F0);
        return ans[k-1][k-1]*F0[k-1][0]+ans[k-1][k-2]*F0[k-2][0];
    }
    public static void main(String[] args) {
        System.out.println(fib(73));
    }
}
