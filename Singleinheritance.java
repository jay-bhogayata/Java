class A{
    void m1(){
        System.out.println("Hello");
    }
}
class B extends A{
    void m2(){
        System.out.println("Namste");
    }
}

class Singleinheritance{
    public static void main(String[] args) {
        B b = new B();
        b.m2();
        b.m1();
    
        
    }
}