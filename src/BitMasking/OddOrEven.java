package BitMasking;

public class OddOrEven {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        if((n&1)==1){
            System.out.println("ODD");
        }else{
            System.out.println("EVEN");
        }
    }
}
