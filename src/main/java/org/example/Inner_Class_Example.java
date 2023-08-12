package org.example;

class Big_Bus{
    int seats;
    public void drive(){
        System.out.println("Hi, I'm a method of a big bus : ");
    }
    class Small_bus{
        public void drive(){
            System.out.println("Hi, I'm from small_bus");
        }
    }
}
public class Inner_Class_Example {
    public static void main(String args[]){
        Big_Bus obj = new Big_Bus(); // calling a method of big_class/outer class
        obj.drive();

        Big_Bus.Small_bus obj1 = obj.new Small_bus();  // We need obj of outer class to access inner class
        obj1.drive();
        // Note : for static methods, we don't objects to access it. we can access without objects.
    }
}
