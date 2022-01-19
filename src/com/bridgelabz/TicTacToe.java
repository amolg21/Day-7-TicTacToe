package com.bridgelabz;

import java.util.Random;
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

    public static void Toss() {
        Random rand = new Random();
        int toss= rand.nextInt(2);
        System.out.println(toss);
        if ( toss==0) {
            System.out.println("User won the toss and will start first.");
        } else {
            System.out.println("Computer won toss and will start first.");
        }
    }

    public static void main(String[] args) {
        TicTacToeInit();
        Toss();
        ChooseValue();
        ShowBoard();
        MakeMove();
        ShowBoard();
    }
}
