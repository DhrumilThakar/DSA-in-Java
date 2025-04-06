public class arraypract 
{
    public static void print(int arr[])
    {
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void reverse(int arr[])
    {
        // for(int i = 0 ;i<arr.length;i++)
        // {
        //     for(int j = i+1;j<arr.length;j++)
        //     {
        //         int temp = arr[j];
        //         arr[j] = arr[i];
        //         arr[i] = temp;
        //     }
        // }

        // With using constant space complexity 
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int largest(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i : arr)
        {
            if(i>largest)
            {
                largest = i;
            }
        }
        return largest;
    }

    public static void pair(int arr[])
    {
        for(int i = 0 ; i<arr.length;i++)
        {
            int current = arr[i];
            for(int j = i+1;j<arr.length;j++)
            {
                System.out.print("["+ current +" , " + arr[j]+"] ");
            }
            System.out.println("");
        }
    }

    public static void sub_array(int arr[])
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            for(int j = i ; j<arr.length ; j++)
            {
                for(int k = i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
  public static void main(String[] args) 
  {
    int[] arr = { 1 , 2, 3, 4, 5, 6, 7, 8, 9};
    // System.out.println("Original array: ");
    // print(arr);
    // System.out.println("Reverse array : ");
    // reverse(arr);
    // print(arr);
    // System.out.println("Largest element in array: "+largest(arr));
    // pair(arr);
    sub_array(arr);
  }  
}