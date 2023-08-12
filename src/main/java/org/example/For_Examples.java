package org.example;

import java.util.Scanner;

public class For_Examples {
    public static void main(String args[]){

        int value;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        value = sc.nextInt();

        for(int i=1;i<=value;i++){
            System.out.println("Day "+i);
            for(int j=9;j<=18;j++){
                System.out.println("Hours : "+(j)+"-"+(j+1));
            }
        }
    }
}
