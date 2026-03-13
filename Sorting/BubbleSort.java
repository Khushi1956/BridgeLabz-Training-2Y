class BubbleSort {
    public static void main(String[] args) {
        int[] marks = {78, 45, 89, 32, 67};

        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Student Marks:");
        for (int m : marks) {
            System.out.print(m + " ");
        }
    }
}
