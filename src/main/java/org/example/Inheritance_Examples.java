package org.example;

import java.util.Scanner;

class AdvCalc extends Calc{ // Derived/Child/Sub Class, Can be inherited from base class, This will contain members of base class
    public int mul(int a, int b){
        return a*b;
    }
    public int div ( int a, int b){
        return a / b;
    }

}

public class Inheritance_Examples {
    public static void main(String args[]){

        AdvCalc obj = new AdvCalc(); // with obj of child class we can access parent class members
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b values");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Addition : "+obj.add(a,b));
        System.out.println("Sub : "+obj.sub(a,b));
        System.out.println("Mul : "+obj.mul(a,b));
        System.out.println("Div : "+obj.div(a,b));

    }
}
