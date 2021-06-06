package ex02.base;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String string = input.nextLine();
        int length = string.length();

        String outputString = string + " has " + length + " characters.";

        System.out.println(outputString);
    }
}
