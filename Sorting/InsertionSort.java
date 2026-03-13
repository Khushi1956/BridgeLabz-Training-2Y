class InsertionSort {
    public static void main(String[] args) {
        int[] empIds = {105, 102, 108, 101, 104};

        for (int i = 1; i < empIds.length; i++) {
            int key = empIds[i];
            int j = i - 1;

            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }
            empIds[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs:");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}
