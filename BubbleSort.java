public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {4, 2, 1, 7, 5, 9, -8, 3};
        int n = arr.length;
        int temp;
        for (int i = 0; i < n-1 ; i++) {
            boolean sorted = true;
            for (int j = 0; j < n-1-i ; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    sorted = false;
                }
            }
            if (sorted) break;
        }
        for (int item: arr) {
            System.out.print(item + " ");
        }
    }
}