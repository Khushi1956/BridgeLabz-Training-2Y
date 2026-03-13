public class FirstLastOccurrence {
    public static int first(int[] arr, int x) {
        int l = 0, r = arr.length - 1, res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                res = mid;
                r = mid - 1;
            } else if (arr[mid] < x) l = mid + 1;
            else r = mid - 1;
        }
        return res;
    }

    public static int last(int[] arr, int x) {
        int l = 0, r = arr.length - 1, res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                res = mid;
                l = mid + 1;
            } else if (arr[mid] < x) l = mid + 1;
            else r = mid - 1;
        }
        return res;
    }
}
