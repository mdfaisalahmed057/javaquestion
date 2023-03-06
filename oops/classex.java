import java.rmi.StubNotFoundException;

// class Details{
//     String name;
//     int age;

// public void show(){
//     System.out.println(this.name);
//     System.out.println(this.age);
 
// }
// }

// public class classex {
//     public static void main(String[] args) {
//         Details ob1=new Details();
//         ob1.name="faisal";
//         ob1.age=2;
//         ob1.show();
//     }
    
// }



// // below is for the parameterized function 
// // class Details {
// //     String name;
// //     String age;

// //     public void show() {
// //         System.out.println(this.name);
// //         System.out.println(this.age);

// //     }

// //     Details(String n,String a) {
         
// //         this.name = n;
// //         this.age = a;
// //     }
// // }

// // public class classex {
// //     public static void main(String[] args) {
// //          Details ob1 = new Details("faisal", "12");
// //          ob1.show();
// //     }

// // }

// // below is for the copy constructor function 
// class Details {
//     String name;
//     String age;

//     public void show() {
//         System.out.println(this.name);
//         System.out.println(this.age);

//     }

//     Details( Details ob2) {
//         this.name=ob2.name;
//         this.age=ob2.age;
        
       
//     }
//     Details(){

//     }
// }

// public class classex {
//     public static void main(String[] args) {
//          Details ob1 = new Details();
//          ob1.name="faisal";
//          ob1.age="112";
//          Details ob2 = new Details(ob1);

         
//          ob2.show();
//     }

// }



// class  Details{
//     int age;
//     String name;
    
// }

/* 
class Details{
    String name;
    int age;

public void show(){
    System.out.println(this.name);
    System.out.println(this.age);
 
}
}
public class classex {
    public static void main(String[] args) {
        Details ob1=new Details();
        ob1.name="faisal";
        ob1.age=2;
        ob1.show();
    }
    
}
*/
class C 
{
    static int a;
    static int b;
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a);
        System.out.println(C.a);
        System.out.println(b);
        System.out.println(C.b);
        test();
        System.out.println(a);
        System.out.println(C.a);
        System.out.println(b);
        System.out.println(C.b);



    }
    public static void test(){
        int b=30;
        System.out.println(a);
        System.out.println(C.a);
        b=50;
        a=10;
    }
}










