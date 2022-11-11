public class basicexample{
    public static void main(String[] args) {
        int x=2;
        fun1(x);
     }
   
static void fun1(int n)
{
   int i = 0;  
   if (n > 1)
     fun1(n - 1);
   for (i = 0; i < n; i++)
      System.out.print(" * ");
}
}


