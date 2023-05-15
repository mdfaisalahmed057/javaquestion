public class printallstring {
    public static void main(String[] args) {
         char[] set1={'a','b','c'};
        int k=3;
        int n=set1.length;
        printallklengthres(set1, " ", n, k);;
    }
    // static void printallklength(char[] set,int k){
    //     int n=set.length;
    //     printallklengthres(set, " ", n, k);
    // }
    static void printallklengthres(char[] set,String prefix,int n ,int k){
        if(k==0){
            System.out.println(prefix);
            return;
        }
        for(int i=0;i<n;i++){// 2
        String newprefix=prefix+set[i];
        printallklengthres(set, newprefix, n, k-1);
        }
    }
}
