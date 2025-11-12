import java.util.*;

public class VotingCount {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        // Simulate 10 votes
        String[] voteStream = {"Aditi", "Rohan", "Aditi", "Khushi", "Rohan", "Aditi", "Rohan", "Khushi", "Aditi", "Rohan"};

        for (String name : voteStream) {
            votes.put(name, votes.getOrDefault(name, 0) + 1);
        }

        // Print results
        System.out.println("🗳️ Final Vote Counts:");
        for (var e : votes.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }

        // Find highest votes
        String winner = Collections.max(votes.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\n🏆 Winner: " + winner);
    }
}
