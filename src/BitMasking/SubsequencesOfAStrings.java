package BitMasking;

public class SubsequencesOfAStrings {
    public static void printSub(int i , String str){
        int j=str.length()-1;
        while(j>=0){
        int mask =1<<j;
        //    System.out.println(mask+" "+j+" "+(i&mask));
         if((i&mask)!=0){
             System.out.print(str.charAt(str.length()-1-j));
         }else{
             System.out.print("");
         }
         j--;
        }
    }
    public static void print(String str){
        int n = str.length();
        System.out.println();
        for(int i=1;i<(1<<n);i++){
            printSub(i,str);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FastReader s = new FastReader();
        String str = s.next();
        print(str);
    }
}
