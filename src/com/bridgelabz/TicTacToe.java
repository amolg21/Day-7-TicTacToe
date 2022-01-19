package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static int i, index;
    static char[] ticTacToe = new char[10];
    static char letter;
    static Scanner sc = new Scanner(System.in);
    static  Random rand = new Random();

    public static void TicTacToeInit() {        // UC-1
        for (i = 0; i < 10; i++) {
            ticTacToe[i] = ' ';
        }
    }

    public static void ChooseValue() {         // UC-2

        System.out.println("Please Select the Letter: X or O");

        //Scanner Method for User Input
        letter = sc.next().charAt(0);
        // System.out.println("Enter the index you want to enter the value (1-9)");
        // int index = sc.nextInt();
        // ticTacToe[index - 1] = letter;

    }

    static void ShowBoard() {                   // UC-3
        for (i = 0; i <= 8; i++) {
            System.out.println(ticTacToe[i] + " | " + ticTacToe[++i] + " | " + ticTacToe[++i] + '\n' + "---------");
        }
    }

    public static void MakeMove() {               // UC-4,5
        System.out.println("Enter the index you want to enter the value (1-9)");

        index = sc.nextInt();
        if (ticTacToe[index-1] == ' ') {
            ticTacToe[index - 1] = letter;
        }
    }

    public static int Toss() {                      // UC-6
        int toss= rand.nextInt(2);
        System.out.println(toss);
        if ( toss==0) {
            System.out.println("User won the toss and will start first.");
        } else {
            System.out.println("Computer won toss and will start first.");
        }
        return toss;
    }

    public static void GameCheck() {                     // UC-7

        for(i=0;i<=6;i++) {                              // Because our conditions are valid till i=6.
            if (i == 0 || i == 1 || i == 2) {
                if ((ticTacToe[i] == ticTacToe[i + 3]) && (ticTacToe[i] == ticTacToe[i + 6]) && ticTacToe[i] != ' ') {
                    System.out.println("WON");
                }
            } else if ((i == 0 || i == 3 || i == 6)) {
                if ((ticTacToe[i] == ticTacToe[i + 1]) && (ticTacToe[i] == ticTacToe[i + 2]) && ticTacToe[i] != ' ') {
                    System.out.println("WON");
                }
            } else if (i == 0) {
                if ((ticTacToe[i] == ticTacToe[i + 4]) && (ticTacToe[i] == ticTacToe[i + 8]) && ticTacToe[i] != ' ') {
                    System.out.println("WON");
                }
            } else if (i == 2) {
                if ((ticTacToe[i] == ticTacToe[i + 2]) && (ticTacToe[i] == ticTacToe[i + 4]) && ticTacToe[i] != ' ') {
                    System.out.println("WON");
                }
            } else {
                System.out.println("Game is still on.....");
            }
        }
    }

    public static void ComputerTurn() {                   // UC-8
        int compturn = rand.nextInt(10);
       if (ticTacToe[compturn] == ' ') {
           ticTacToe[compturn] = 'O';
       }
    }
    public static void main(String[] args) {
        TicTacToeInit();
        Toss();
        ChooseValue();
        ShowBoard();
        MakeMove();
        ShowBoard();
        GameCheck();
    }
}
