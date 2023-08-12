package org.example;
// Points to remeber, Every Constructor will have super() method in side, but that is hidden
// That is the reason that is calling super class of it

// super() method calls the constructor of the super class
// this() methos calls the constructor of a same class

class Parent{
    public Parent() { // default
        System.out.println("In Parent Class");
    }
    public Parent(int a ) { //parameterized
        System.out.println("In Parent Class with param");
    }
}
class Child1 extends Parent{
    public Child1(){// default
        System.out.println("In Child1 Class");
    }
    public Child1(int a){//parameterized

        // super() This is hidden, it will call the super class default constructor (i.e : Parent())
        //super(a); // This is hidden, it will call the super class parameterized constructor (i.e : Parent(int a))
        this(); //calls the constructor of the same class
        System.out.println("In Child1 Class with param");
    }
}
public class This_Super_Examples {
    public static void main(String args[]){

        Child1 ch = new Child1(5);

    }
}
