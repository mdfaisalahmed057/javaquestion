 import java.util.*;
public class bulbmachine
{
    public static void main (String[]args)
    {
         int a[]={1,2,3,4};
         Arrays.sort(a);
        ArrayList < Integer > a1 = new ArrayList <> ();
      
        for (int i = a.length - 1; i >= 0; i--)
        {
            int x = 0;
            x = a[i] * (a.length - i);//1*1=1,4,3
            a1.add (x);
        }
     
        for (int i = 0; i < a1.size (); i++)
        {
            if (a1.get (a1.size () - 1 - i) >= a1.get (i))
	        {
                System.out.println (a1.get (a1.size () - 1 - i));
                break;
            }
        }
    }
}