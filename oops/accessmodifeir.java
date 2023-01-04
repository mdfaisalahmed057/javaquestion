 
class Account{
   public  String name;
   protected String email;
    private String password;

    //getter setter 
    public String getpassword()
    {
        return this.password;
    }
    public void setpassword(String pass)
    {
        this.password=pass;
     }   
}


public class accessmodifeir {
    public static void main(String[] args) {
        Account ob1=new Account();
        ob1.name="faisal";
        ob1.email="faisal";
        ob1.setpassword("nndkdjdk");
        System.out.println(ob1.getpassword());

     }
    
}
