/**
 * Q5. Circular Tour Problem (Petrol Pump Problem)
 * 
 * Given a set of petrol pumps, each with an amount of petrol and a distance to the
 * next pump, find the starting pump index from which a circular tour can be completed.
 * 
 * Approach (Queue Simulation / Single Pass):
 * - Track cumulative surplus petrol as you move forward.
 * - If at any point surplus becomes negative, the starting point is invalid.
 *   Reset the start to the next pump and reset current surplus to 0.
 * - If total petrol across all pumps >= total distance, a solution is guaranteed.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Q5_CircularTourProblem {

    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    /**
     * Returns the index of the starting pump for completing the circular tour.
     * Returns -1 if no valid starting point exists.
     */
    public static int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        int totalSurplus = 0; // total petrol surplus across the whole tour
        int currentSurplus = 0; // surplus from the current starting point
        int start = 0;

        for (int i = 0; i < n; i++) {
            int surplus = pumps[i].petrol - pumps[i].distance;
            currentSurplus += surplus;
            totalSurplus += surplus;

            // If current surplus drops below 0, current start is invalid
            if (currentSurplus < 0) {
                start = i + 1;       // Try next pump as new starting point
                currentSurplus = 0;  // Reset current surplus
            }
        }

        // If total surplus is negative, no solution exists
        return totalSurplus >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps1 = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };
        int result1 = findStartingPoint(pumps1);
        System.out.println("Starting point (0-indexed): " + result1); // Expected: 1

        PetrolPump[] pumps2 = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };
        int result2 = findStartingPoint(pumps2);
        System.out.println("Starting point (0-indexed): " + result2); // Expected: 2

        PetrolPump[] pumps3 = {
            new PetrolPump(1, 5),
            new PetrolPump(2, 3),
            new PetrolPump(1, 4)
        };
        int result3 = findStartingPoint(pumps3);
        System.out.println("Starting point (0-indexed): " + result3); // Expected: -1 (impossible)
    }
}
