package org.example;

import java.util.Scanner;

public class Arrays_Examples {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row, col;
        System.out.println("Enter the Row Size : ");
        row = sc.nextInt();
        System.out.println("Enter the Column Size : ");
        col = sc.nextInt();
        int numbers [][] = new int[row][col];

        for (int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

    }
}
