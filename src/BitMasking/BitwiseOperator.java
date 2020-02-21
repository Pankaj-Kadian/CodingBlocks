package BitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BitwiseOperator {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    // /,*-> n^2
    // % -> n^3
    // &,|,^ >>,<< -> n
    public static int and(int a , int b){
        return  a&b;
    }
    public static int or(int a , int b){
        return  a|b;
    }
    public static int xor(int a , int b){
        return  a^b;
    }
    public static int leftShift(int a , int n){
        return a<<n;
    }
    public static int rightShift(int a,int n){
        a = a>>n;
        return  a;
    }
    public static void main(String[] args){
        FastReader s = new FastReader();
        System.out.println(leftShift(5,2));
    }
}
