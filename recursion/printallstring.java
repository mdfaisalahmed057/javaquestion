public class printallstring {
    public static void main(String[] args) {
        System.out.println("first test");
        char[] set1={'a','b'};
        int k=3;
        printallklength(set1, k);
    }
    static void printallklength(char[] set,int k){
        int n=set.length;
        printallklengthres(set, " ", n, k);
    }
    static void printallklengthres(char[] set,String prefix,int n ,int k){
        if(k==0){
            System.out.println(prefix);
            return;
        }
        //one by one add all character
        //from set and recursivly
        // call for k eqauls k-1
        for(int i=0;i<n;i++){// 2
            //next character  of input added
            String newprefix=prefix+set[i];
            // k is decreased because
            ///we have added a new character
            printallklengthres(set, newprefix, n, k-1);
        }

    }
}
