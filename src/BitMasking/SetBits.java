package BitMasking;

public class SetBits {
    public static int count1(int n ){
        int count = 0;
        while(n>0){
            count=count+(n&1);
            n=n>>1;
        }
        return count;
    }
    public static int count2(int n){
        // n & n-1 hack by this hack the last set bit gets remove because it is always changes between n and n-1
    int count = 0;
    while(n>0){
        n=(n)&(n-1);
        count++;
    }
    return count;
    }

    public static void main(String[] args) {
        int n =13;
        System.out.println(count1(n));
        System.out.println(count2(n));
    }
}
