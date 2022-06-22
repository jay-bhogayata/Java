import java.util.*;

class UserInput{

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number here : ");
        int a = sc.nextInt();
        System.out.println("Given Number is " + a); 

        System.out.println("Enter float number here : ");
        float b = sc.nextFloat();
        System.out.println("given float number is " + b);
        
        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println("your name is :" + name);
        
        sc.close();

    }

}