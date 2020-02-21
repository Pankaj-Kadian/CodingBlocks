package BitMasking;

public class NQueen {
    public static int result(int[][] board,int[] d1,int[] d2,int[] col,int i){
        if(i>=board.length){
            return 1;
        }
        int n=board.length;
        int ans=0;
        for(int j=0;j<n;j++){
            if(col[j]!=1 && d1[i-j+n-1]!=1 && d2[i+j]!=1){
                col[j]=1;
                d1[i-j+n-1]=1;
                d2[i+j]=1;
                ans=ans+result(board,d1,d2,col,i+1);
                col[j]=0;
                d1[i-j+n-1]=0;
                d2[i+j]=0;
            }
        }
    return ans;
    }
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int[][] board = new int[n][n];
        int d1[] = new int[2*n-1];
        int d2[] = new int[2*n-1];
        int col[] = new int[n];
        int ans = result(board,d1,d2,col,0);
        System.out.println(ans);
    }
}
