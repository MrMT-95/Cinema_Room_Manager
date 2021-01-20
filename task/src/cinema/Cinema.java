package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here

        CreateCinema createCinema = new CreateCinema();
        Statistics statistics = new Statistics();
        char[][] cinema = createCinema.create();

        Ticket ticket = new Ticket(statistics);
        Seats seats = new Seats();

        int input = 94995;

        while (input != 0) {
            System.out.println("\n1. Show the seats\n" +
                    "2. Buy a ticket\n" +
                    "3. Statistics\n" +
                    "0. Exit");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    seats.get(cinema);
                    break;
                case 2:
                    ticket.buy(cinema);
                    break;
                case 3:
                    statistics.get(cinema);

            }
        }


    }
}