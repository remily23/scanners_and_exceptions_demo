package scanners;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Please enter your name:");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.println("What's your favourite number?");

        int favouriteNumber = scanner.nextInt();

        System.out.println("I like " + favouriteNumber + " too!");

    }

}
