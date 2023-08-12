package org.example;
// Case Study :

// We want to override/change the behaviour for the show method without inheriting the class
abstract class A{
    public abstract void show();
    public abstract String show2();

}
public class Anonymous_Inner_Class {
    public static void main(String args[]){
        A obj = new A(){ // This is the new implementation for show method with the help of anonymous inner class
            // Here we are not creating an object of a abstract class, we are creating an object of Anonymous inner class
            public void show(){ // We can implement
                System.out.println("In a New Show"); // This will not get printed in the console, try it.
            }
            public String show2(){
                return "In Show2..!";  // This will return the result back to the function call
            }
        };

        System.out.println(obj.show2()); // This is used to print the value from show2 method.

    }
}
