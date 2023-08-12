package org.example;
abstract class Test{ // This is an abstract class
    public abstract void rank();// Declaring the method as abstract method, Bcoz don't know how to implement it.
    public abstract void method2();
    public void Total(){
        System.out.println("I'm giving the total :");
    }
}
class School extends Test{  //This is Concrete Class
    public void rank(){
        System.out.println("Hey..I know how to implement rank method from Test abstract class");
    }
    public void method2(){
        System.out.println("I'm implementing method2");
    }
}
public class Abstract_Class_Example {

    public static void main(String args[]){
       //Test obj = new Test(); // U can't create object of the abstract class
        School obj = new School();
        obj.Total();
        obj.rank();
        obj.method2();

    }
}
