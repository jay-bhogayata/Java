class Animal1{
    void eat(){
        System.out.println("Eating..");
    }
}

class dog1 extends Animal1{
    void bark(){
        System.out.println("barking...");
    }
}

class human1 extends Animal1{
    void speak(){
        System.out.println("Speaking...");
    }
    public static void main(String[] args) {
        human1 h1 = new human1();
        h1.eat();
        h1.speak();
        
    }
}
