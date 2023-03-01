public class print10withoutloop{
	public static void main(String[] args)
	{	
     	String str ="GeeksforGeeks";
 		System.out.println(recLen(str));
	}
 	  static int recLen(String str)
	{
  		if (str.equals(""))
			return 0;
		else
			return recLen(str.substring(1))+1 ;
	}

 }

 