package Arrays;

import java.util.*;

public class GamingHub {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int Players = sc.nextInt();

        int scores[] = new int[Players];

        System.out.println("Enter scores of players: ");
        for (int i = 0; i < Players; i++) {
            scores[i] = sc.nextInt();
        }

        System.out.print("Enter the health of pillar 1: ");
        int pillar1Health = sc.nextInt();

        System.out.print("Enter the health of pillar 2: ");
        int pillar2Health = sc.nextInt();

        int clearedPlayers = 0;

        for (int i = 0; i < Players; i++) {
            if (canBreakPillars(scores[i], pillar1Health, pillar2Health)) {
                clearedPlayers++;
            }
        }

        System.out.println("Total no. of players who cleared the level: " + clearedPlayers);
    }

    public static boolean canBreakPillars(int PlayerScore, int pillar1health, int pillar2health) {
        if ((pillar1health % PlayerScore == 0) && (pillar2health % PlayerScore == 0)) {
            return true;
        }
        return false;
    }
}