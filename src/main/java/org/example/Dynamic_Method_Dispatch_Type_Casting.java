package org.example;

class Parent1{
   public void method1(){
       System.out.println("In a parent method");
   }
}

class Child extends Parent1{
    public void method2(){
        System.out.println("In a child class");
    }
}

public class Dynamic_Method_Dispatch_Type_Casting{

    public static void main(String args[]){

        Parent1 obj = new Child();  // Methods are called as per object creation not the reference's. Example of polymorhism
        //same obj can behave differently, so this is called as run time polymorphism
        //This is only applicable if the above classes are inherited.
        obj.method1();

        obj = (Parent1) new Child();   // This is upcasting
        obj.method1();

        Child obj1 = (Child) obj;  // This is downcasting
        obj1.method2();




    }
}
