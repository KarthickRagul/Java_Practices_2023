package org.example;

// This is an example of Method overloading
// Same method name, different no.of arguments, different data type of arguments
class Calculator {
    public void add(int a, int b, int c){
        System.out.print(a+b+c);
    }
    public int add(int a, int b){
        return a+b;
    }
    public double add(int a, double b){
        return a+b;
    }
}
public class Method_Overloading {
    public static void main(String args[]){

        Calculator cl = new Calculator(); //Object/Instance creation  here cl is called as "Reference variable"
        System.out.println(cl.add(5,4)); //Explicitly printing the result as the func has return type
        System.out.println(cl.add(3,4.5)); //Explicitly printing the result as the func has return type
        cl.add(3,4,9); // print statement is there in the function
    }
}
