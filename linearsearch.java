import java.util.*;
public class linearsearch {
    public static void linearsearch1(int arr[], int search) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                flag++;
            }
        }
        if (flag != 0) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " element of the array : ");
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the element who you have to search for : ");
        int search = s.nextInt();
        linearsearch1(arr, search);
        s.close();
    }
}