package com.test;
import org.example.Calc;
//Packages Example
public class Test {

    public static void main(String args[]){
        Calc c = new Calc();  //To access this class from other folder we should use import keyword. For that Class should be Public
        System.out.println(c.add(5,4));

    }
}
