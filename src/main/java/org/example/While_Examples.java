package org.example;

public class While_Examples {
    public static void main(String args[]){
        int num = 1;

        while (num < 3){  // Until the condition is TRUE, it will execute
            System.out.println("I'm in while loop "+num);
            int num2 = 1;
            while (num2 < 3){
                System.out.println("     I'm inside of inner loop "+num2);
                num2++;
            }
            num ++; //This is used to increment the num value, else loop will be infinite loop

        }
    }
}
