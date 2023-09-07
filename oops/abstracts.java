abstract class animal {
    abstract void walk();
}

class horse extends animal {
    public void walk() {
        System.out.println("4 legs");

    }

}
class chicken extends animal {
    public void walk() {
        System.out.println("2 legs");

    }

}

public class abstracts {
    public static void main(String[] args) {
chicken obj=new chicken();
obj.walk();
    }
}


// abstract class man{
//     String name;
//     int age;
    
// }



// abstract class Animal{
//   abstract void name();
// }

// class Legs extends Animal{
//     public void name() {
//         System.out.println("four legs are there ");
//     }
// }


// class abstracts{
//     public static void main(String[] args) {
//         Legs obj=new Legs();
//         obj.name();
//     }
// }


// ****************************interface***********************



//  interface Fullname{
//     void firstname();
//  }

//  class First implements Fullname{
//     public void firstname() {
//         System.out.println("this is first name");
//     }
//  }
//  class Second implements Fullname{
//     public void firstname() {
//         System.out.println("this is second name");
//     }
//  }

//  class abstracts{
//     public static void main(String[] args) {
//         Fullname obje=new Fullname();
//         obje.firstname();

//     }
//  }



// multiple inheritance

// interface Fullname{
//     void first();
// }
// interface Lastname{
// void  last();
// }

// class F implements Fullname,Lastname{
//     public void first() {
//         System.out.println("this is first name");
//     }
//      public void last() {
//         System.out.println("this is last name");
        
//      }
//     }
 
// class abstracts{
//     public static void main(String[] args) {
//          F obj2=new F();
//         obj2.first();
//         obj2.last();
//      }

// }