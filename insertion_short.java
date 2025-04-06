import java.util.*;

public class insertion_short {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Entering the element of the array  ! ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("The array before shorting  is :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println(" ");
        System.out.println("The array after shorting  is :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        s.close();
    }
}