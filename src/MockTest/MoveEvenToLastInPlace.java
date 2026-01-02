package MockTest;

public class MoveEvenToLastInPlace {
    static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 6, 3, 8};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
