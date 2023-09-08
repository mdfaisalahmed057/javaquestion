import java.util.*;
public class rotatechar{
    
    static String leftrotate(String str, int d)
    {
        String ans = str.substring(d) + str.substring(0, d);
        System.out.println("this is the first anser"+" "+ans);
        return ans;
    }
    public static void main(String args[])
    {
     String str1="faisal";
     int n=3;
        String rotate = leftrotate(str1, n);
        System.out.println(rotate);
        char ch1[] = str1.toCharArray();//faisl
        char ch2[] = rotate.toCharArray();
        int count = 0;
        int p=0;
        for(int i=0 ; i<str1.length() ; i++){
            if(ch1[i] == ch2[i])
                count++;
                p=i;
                System.out.println(p);
        }
        System.out.println("index"+p);
        System.out.print(""+count);
    }
} 
    
