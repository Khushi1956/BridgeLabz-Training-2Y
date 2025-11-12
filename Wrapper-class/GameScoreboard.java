import java.util.*;

public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {100, null, 80, 90, null, 70};

        int total = 0;
        int nullCount = 0;

        for (Integer score : scores) {
            if (score == null) {
                nullCount++;
            } else {
                total += score; // auto-unboxing
            }
        }

        System.out.println("Players not played: " + nullCount);
        System.out.println("Total Valid Score: " + total);
    }
}
