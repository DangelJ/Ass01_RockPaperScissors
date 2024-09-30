import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String player1 = "";
        String player2 = "";
        String done = "N";
        String again = "Y";

        while (again.equalsIgnoreCase("Y")) {
            while (done.equals("N")) {
                System.out.println("Player 1 please enter your move [RPS]: ");
                player1 = console.next();
                console.nextLine();

                if (player1.equalsIgnoreCase("R") || player1.equalsIgnoreCase("P") || player1.equalsIgnoreCase("S")) {
                    done = "Y";
                } else {
                    System.out.println("Please enter a valid input [RPS]: ");
                }
            }

            done = "N";

            while (done.equals("N")) {
                System.out.println("Player 2 please enter your move [RPS]: ");
                player2 = console.next();
                console.nextLine();

                if (player2.equalsIgnoreCase("R") || player2.equalsIgnoreCase("P") || player2.equalsIgnoreCase("S")) {
                    done = "Y";
                } else {
                    System.out.println("Please enter a valid input [RPS]: ");
                }
            }

            if (player1.equalsIgnoreCase("R")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock");
                    System.out.println("It's a Tie!");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors");
                    System.out.println("Player 1 Wins!");
                } else {
                    System.out.println("Paper covers Rock");
                    System.out.println("Player 2 Wins!");
                }
            }
            if (player1.equalsIgnoreCase("P")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock");
                    System.out.println("Player 1 Wins!");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cuts Paper");
                    System.out.println("Player 2 Wins!");
                } else {
                    System.out.println("Paper vs Paper");
                    System.out.println("It's a Tie!");
                }
            }
            if (player1.equalsIgnoreCase("S")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors");
                    System.out.println("Player 2 Wins!");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors");
                    System.out.println("It's a Tie!");
                } else {
                    System.out.println("Scissors cuts Paper");
                    System.out.println("Player 1 Wins!");
                }
            }


            System.out.println("Play Again? [Y/N]: ");
            if (console.next().equalsIgnoreCase("Y")) {
                again = "Y";
            } else {
                again = "N";
            }
            done = "N";
        }
    }
}