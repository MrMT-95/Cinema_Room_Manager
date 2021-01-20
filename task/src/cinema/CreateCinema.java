package cinema;

import java.util.Scanner;

public class CreateCinema {

    public char[][] create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of seats in each row:");
        int seats = Integer.parseInt(scanner.nextLine());

        char[][] cinema = new char[rows][seats];

        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= seats; i++) {
            System.out.print(" " + i);
        }

        for (int i = 1; i <= rows; i++) {
            System.out.print("\n" + i);
            for (int j = 1; j <= seats; j++) {
                char seat = cinema[i - 1][j - 1] = 'S';
                System.out.print(" " + seat);
            }
        }

        return cinema;
    }
}
