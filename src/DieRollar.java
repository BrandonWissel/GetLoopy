import java.util.Random;
import java.util.Scanner;
public class DieRollar {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        int die1, die2, die3, sum;
        int dieRoll;
        boolean done = false;
        String continueYN;
        do {
            dieRoll = 0;
            System.out.println("\tRoll\tDie1\tDie2\tDie3\tSum");
            System.out.println("\t_________________________________");
            do {
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                sum = die1 + die2 + die3;
                dieRoll++;
                System.out.printf("%6d\t%4d\t%4d\t%4d\t%6d\n", dieRoll, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3));
            System.out.print("Play again? [Y/N] ");
            continueYN = in.nextLine();
            if (continueYN.equalsIgnoreCase("n")) {
                done = true;
            }
        } while (!done);
        in.close();
    }
}
