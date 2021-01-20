package cinema;

import java.util.Scanner;

public class Ticket {

    Statistics statistics;

    public Ticket(Statistics statistics) {
        this.statistics = statistics;
    }


    public void buy(char[][] cinema) {
        System.out.println("");

        selectSeat(cinema);


    }

    public void selectSeat(char[][] cinema) {
        try {


            Scanner scanner = new Scanner(System.in);
            int rows = cinema.length;
            int seats = cinema[0].length;
            System.out.println("Enter a row number:");
            int rowNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter a seat number in that row:");
            int seatNumber = Integer.parseInt(scanner.nextLine());


            if (cinema[rowNumber - 1][seatNumber - 1] == 'B') {
                System.out.println("That ticket has already been purchased!");
                selectSeat(cinema);
            } else {
                cinema[rowNumber - 1][seatNumber - 1] = 'B';
                int seatsCount = rows * seats;

                int price = 10;
                if (seatsCount > 60) {
                    int half = rows / 2;
                    if (rowNumber > half) {
                        price = 8;
                    }
                }
                statistics.add(price);
                System.out.println("Ticket price: $" + price);
            }
        } catch (Exception e) {
            System.out.println("Wrong input");
            selectSeat(cinema);
        }


    }
}
