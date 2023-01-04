

// class Poly{
//     String name;
//     String age;

//     public void show(String name){
//         System.out.println(name);
//     }
//     public void show(int age){
//         System.out.println(age);
//     }   
//     public void show(int age,String name){
//         System.out.println(age+" "+name);
//     }   
// }
// public class polymorphism {
//     public static void main(String[] args) {
//         Poly ob1=new Poly();
//         ob1.show("faisal");
//         ob1.show(12,"ahmed");
//         ob1.show(12);


//     }
     
// }


// runtime polymorphism or method overriding ::==> Runtime polymorphism is also known as dynamic polymorphism. Function overriding is an example of runtime polymorphism. Function overriding means when the child class contains the method which is 
// already present in the parent class. Hence, the child class overrides the method of the parent class

class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
 }
 class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }  
 }
 class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
 }
 
 public class polymorphism {
    public static void main(String[] args) {
        Shape ob1=new Shape();        
        ob1.area();
        Triangle ob2=new Triangle();
        ob2.area(12,12);
    }
     
}