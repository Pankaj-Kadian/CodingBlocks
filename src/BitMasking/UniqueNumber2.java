package BitMasking;

public class UniqueNumber2 {
    public static void result(int[] arr){
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            ans=ans^arr[i];
        }
        // obtain a set bit so that partition can be made
        int ans2=ans;
        int i =0;
        while(true){
            if((ans&1)!=0){
                break;
            }
            i++;
            ans=ans>>1;
        }
        int number1=0;
        for(int j=0;j<n;j++){
            if(((1<<i)&arr[j])!=0){
                number1=number1^arr[j];
            }
        }
        int number2 = number1^ans2;
        System.out.println(number1+" "+number2);
    }
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        result(arr);
    }
}
