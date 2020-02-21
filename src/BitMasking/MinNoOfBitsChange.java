package BitMasking;

public class MinNoOfBitsChange {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int a = s.nextInt();
        int b = s.nextInt();
        int ans = a^b;
        int count = 0;
        while(ans!=0){
            count = count+(ans&1);
            ans=ans>>1;
        }
        System.out.println(count);
    }
}
