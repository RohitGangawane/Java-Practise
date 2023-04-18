interface learning{

    void learn();
}

abstract class A implements learning {
    public void learn() {
        System.out.println("I am learning Java");

    }
}
class B extends A{
    public void learn() {
        System.out.println("I am learning Python");
    }
}


public class P4 {
    public static void main(String[] args) {
        A b1 = new B();
        b1.learn();
    }
    
}
