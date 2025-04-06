// package sorting;

public class bubble_sort 
{
    public static void main(String[] args) 
    {
        int [] arr = {1,3,4,5,9,7,8,6,2};
        System.out.println("Array before sorting is : ");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        for(int i =0;i<arr.length;i++)
        {
            for(int j = i;j<arr.length;j++)
            {
                /*This is for printing reverse sorting means decending order */
                // if(arr[j]>arr[i])
                // {
                //     int temp = arr[i];
                //     arr[i] = arr[j];
                //     arr[j] = temp;
                // }

            //This is for increasing order
                if(arr[j]<arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nArray after sorting is : ");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}
