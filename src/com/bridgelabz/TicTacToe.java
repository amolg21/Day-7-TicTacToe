package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    static int i;
    static char[] ticTacToe = new char[10];
    static char letter;

    public static void TicTacToeInit() {
        for (i = 1; i < 10; i++) {
            ticTacToe[i] = ' ';
        }
    }

    public static void ChooseValue() {

        while (letter != 'X' && letter != 'O') {
            System.out.println("Please Select the Letter: X or O");

            //Scanner Method for User Input
            Scanner sc = new Scanner(System.in);
            letter = sc.next().charAt(0);
            switch (letter) {
                case 'X':
                    System.out.println("Player Selected " + letter + " Symbol");
                    break;
                case 'O':
                    System.out.println("Player Selected " + letter + " Symbol");
                    break;
                default:
                    System.out.println("Please Select the Symbol From X or O only");
                    break;

            }
        }
    }

    static void ShowBoard() {
        for (i = 1; i < 10; i++) {
            System.out.println(ticTacToe[i] + " | " + ticTacToe[i++] + " | " + ticTacToe[i++] + '\n' + " --- ");

        }
    }

    public static void main(String[] args) {
        TicTacToeInit();
        ChooseValue();
        ShowBoard();
    }
}
