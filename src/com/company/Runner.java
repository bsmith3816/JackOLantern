package com.company;
import java.util.Scanner;

public class Runner{

    public static void main(String[] args) {
	// write your code here
        String[][] faceFeatures = new String[5][8];
        JackOLantern lantern = new JackOLantern(faceFeatures);

        Scanner in = new Scanner (System.in);
        String statement;
        System.out.println("Welcome to the Jack O Lantern creator! Let's get you started on creating your own Jack O Lantern! " +
                "Firstly, which texture would you like to use?");
        statement = in.nextLine();

        lantern.fill(statement); // Not sure why methods are not traceable

        System.out.println("Now, which eyes would you like to use?");
        statement = in.nextLine();

        lantern.edit(statement, 1, 1);
        lantern.edit(statement, 1, 6);

        System.out.println("Finally, what would you like to use for the mouth?");
        statement = in.nextLine();

        for(int i = 2;i < 6;i++){
            lantern.edit(statement, 3, i);
        }

        System.out.println("Okay, here is the final product based off of your choices!");

        System.out.println(lantern);

    }
}
