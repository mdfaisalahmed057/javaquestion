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
horse obj=new horse();
obj.walk();
    }
}
