package BitMasking;

public class XorSwapping {
    public static void main(String[] args) {
        FastReader s= new FastReader();
        int a = s.nextInt();
        int b = s.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
