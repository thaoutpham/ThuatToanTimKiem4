import java.util.Scanner;

public class Recursion {
    public Recursion(){}


    public int  binarySearch(int[] array, int left, int right ,int value) {
        int middle = (right - 1) / 2;
        while (left <= right) {
            if (array[middle] == value) {
                return middle;
            }
            if (value > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        } return -1;
    }
    public static void main(String[] args) {
        System.out.println("nhập số lượng phần tử ");
        Scanner scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        int array[] = new int[element];
        System.out.println("nhập các  giá trị vào mảng");
        for (int i = 0; i < array.length; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        Recursion recursion = new Recursion();
        int right = element;
        System.out.println("nhập số muốn tìm: ");
        int value = scanner.nextInt();
        if (recursion.binarySearch(array, 0, right, value) == -1) {
            System.out.println("không có số trong mảng");
        } else {
            System.out.println(" vị trí trong mảng là"+recursion.binarySearch(array, 0, right, value)) ;
        }

    }
}
