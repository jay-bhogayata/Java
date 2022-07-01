class A{
    void m1(){
        System.out.println("Hello");
    }
}

class B extends A {
    void m2(){
        System.out.println("Namste");
    }
}

class C extends B {
    void m3(){
        System.out.println("bonjour");
    }
}

public class Multilevelinheritance {

    public static void main(String[] args) {
        C c = new C();
        c.m1();
        c.m2();
        c.m3();
    }
    
}
