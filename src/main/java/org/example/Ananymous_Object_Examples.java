package org.example;

class Students{
    int roll_no;

    public void show(){
        System.out.println("in show");
    }

}

public class Ananymous_Object_Examples {
    public static void main(String args[]){
        new Students().show(); // This is the anaymous object creation, don't have any reference variable, used only unce


    }
}
