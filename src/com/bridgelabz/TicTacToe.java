package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    public static void TicTacToeInit() {
        int i = 0;
        char[] ticTacToe = new char[10];
        for (i = 0; i < 10; i++) {
            ticTacToe[i] = ' ';
        }
    }
      public static void ChooseValue() {

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the letter X or O");
          char ch = sc.next().charAt(0);

        }

    public static void main(String[] args) {
        // write your code here
    }
}
