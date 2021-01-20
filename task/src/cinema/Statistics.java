package cinema;

public class Statistics {
    int income;
    int soldTicketCount = 0;

    public void get(char[][] cinema) {

        int rows = cinema.length;
        int seats = cinema[0].length;
        int seatsCount = rows * seats;

        int possibleIncome;
        if (seatsCount > 60) {
            int half = rows / 2;
            possibleIncome = half * seats * 10 + (rows - half) * seats * 8;
        } else {
            possibleIncome = seatsCount * 10;
        }

        double soldPercentage = soldTicketCount / (double) seatsCount*100;


        System.out.printf("Number of purchased tickets: %d", soldTicketCount);
        System.out.printf("\nPercentage: %.2f%%", soldPercentage);
        System.out.printf("\nCurrent income: $%d", income);
        System.out.printf("\nTotal income: $%d", possibleIncome);
    }

    public void add(int ticketPrice) {
        income += ticketPrice;
        soldTicketCount++;
    }
}
