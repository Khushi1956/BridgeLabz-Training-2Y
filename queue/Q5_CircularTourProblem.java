public class Q5_CircularTourProblem {

    static class PetrolPump {
        int petrol, distance;
        PetrolPump(int p, int d) { petrol = p; distance = d; }
    }

    static int findStartingPoint(PetrolPump[] pumps) {
        int total = 0, curr = 0, start = 0;
        for (int i = 0; i < pumps.length; i++) {
            int surplus = pumps[i].petrol - pumps[i].distance;
            curr += surplus;
            total += surplus;
            if (curr < 0) { start = i + 1; curr = 0; }
        }
        return total >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };
        System.out.println("Starting index: " + findStartingPoint(pumps));
    }
}
