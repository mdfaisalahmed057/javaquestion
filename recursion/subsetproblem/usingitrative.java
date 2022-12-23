public class usingitrative {
    public static void main(String[] args) {
        String p="";
        String up="abc";
        iterate(p, up);

    }
    public static void iterate(String p,String up) {
        if(up.length()==0){
            System.out.println(p);
            return;
        }
         char[] chs=up.toCharArray();
        for(int i=0;i<chs.length;i++){
            iterate(p+chs[i], up.substring(i+1));
            iterate(p, up.substring(i+1));
        }
    }
}
