public class FirstNegativeSearch {

    static int firstNegative(int[] arr) {
        int low = 0, high = arr.length - 1, ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < 0) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, -1, -2};
        System.out.println(firstNegative(arr));
    }
}
