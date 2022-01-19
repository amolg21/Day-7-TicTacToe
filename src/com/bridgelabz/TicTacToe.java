package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    static int i;
    static char[] ticTacToe = new char[10];
    static char letter;
    static Scanner sc = new Scanner(System.in);

    public static void TicTacToeInit() {
        for (i = 0; i < 10; i++) {
            ticTacToe[i] = ' ';
        }
    }

    public static void ChooseValue() {

        System.out.println("Please Select the Letter: X or O");

        //Scanner Method for User Input
        letter = sc.next().charAt(0);
        // System.out.println("Enter the index you want to enter the value (1-9)");
        // int index = sc.nextInt();
        // ticTacToe[index - 1] = letter;

    }

    static void ShowBoard() {
        for (i = 0; i <= 8; i++) {
            System.out.println(ticTacToe[i] + " | " + ticTacToe[++i] + " | " + ticTacToe[++i] + '\n' + "---------");
        }
    }

    public static void MakeMove() {
        System.out.println("Enter the index you want to enter the value (1-9)");

        int index = sc.nextInt();
        if (ticTacToe[index-1] == ' ') {
            ticTacToe[index - 1] = letter;
        }
    }

    public static void main(String[] args) {
        TicTacToeInit();
        ChooseValue();
        ShowBoard();
        MakeMove();
        ShowBoard();
    }
}
