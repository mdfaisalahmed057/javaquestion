package arrrays;
import java.util.*;
public class bulbmachine
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int a[] = new int[n];
        
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt ();
        Arrays.sort (a);
        ArrayList < Integer > a1 = new ArrayList <> ();
     
        for (int i = a.length - 1; i >= 0; i--)
        {
            int x = 0;
            x = a[i] * (a.length - i);
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