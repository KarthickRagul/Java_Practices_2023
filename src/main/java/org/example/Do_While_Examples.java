package org.example;

import java.util.Scanner;

public class Do_While_Examples {
    public static void main(String args[]){
        int value;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value : ");
        value = sc.nextInt();

        do{
            System.out.println("Hi...Irrespective of Value, I will run atleast once if the value is positive");
        }while (value<=0); //While condition will be checked after execution of the do block

    }
}
