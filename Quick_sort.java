public class Quick_sort  //Time complexity in average case is O(nlogn)
                        //Time Complexity in worst case is O(n^2)
                        //Space complexity is O(1)
{
    public static void quick (int arr[],int si , int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pIndx = partion(arr,si,ei);
        quick(arr,si,pIndx-1);
        quick(arr,pIndx+1,ei);
    }

    public static int partion(int arr[],int si, int ei)
    {
        int pivot = arr[ei];
        int i = si-1; //To make place (Coz i=-1)

        for(int j=si;j<ei;j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; //Aiye pivot = arr[i] no lakhai karan ke aapde enu index joie
        arr[i] = temp;
        return i;
    }

    public static void print(int arr[])
    {
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
 public static void main(String[] args) 
 {
    int[] arr = {6, 3, 5, 2, 8, 9};
    quick(arr, 0, arr.length-1);
    print(arr);
 }   
}