public class SelectionSort {
    public static void main(String []args) {
        int[] arr = {-4, 5, 4, 1, 2, 8};
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
