package ex02;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("What the input string? ");
        String str=input.nextLine();
        int count=0;

        // counting total # of char present


        //concat
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ')
                count++;
        }

        //output
        System.out.println("\n"+str+" has"+count+" characters.");
    }
}
