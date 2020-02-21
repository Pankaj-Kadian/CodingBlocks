package BitMasking;

public class ExtractIBit {
    public static void main(String[] args) {
        // the idea is to and that bit and if that bit is 1 then their will be a number formed so it is !=0
        FastReader s = new FastReader();
        int n = s.nextInt();
        int i = s.nextInt();
        int mask = 1<<i;
        if(((mask&n)&1)!=0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
