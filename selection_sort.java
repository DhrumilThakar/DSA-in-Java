public class selection_sort{
    public static void main(String[] args) {
        int[] arr={5,4,1,6,2,3,7};
        System.out.println("Befor sorting array is : ");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        for(int i =0;i<arr.length;i++)
        {
            int small = i;
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[small])
                {
                    small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
        System.out.println("After sorting array is : ");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}