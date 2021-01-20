package cinema;

public class Seats {

    public void get(char[][] cinema) {

        int rows = cinema.length;
        int seats = cinema[0].length;

        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= seats; i++) {
            System.out.print(" " + i);
        }

        for (int i = 1; i <= rows; i++) {
            System.out.print("\n" + i);
            for (int j = 1; j <= seats; j++) {

                System.out.print(" " + cinema[i - 1][j - 1]);
            }

        }
        System.out.println("");
    }
}
