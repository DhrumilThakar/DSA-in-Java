public class sortingpact 
{
    public static void bubble(int arr[])
    {
        for(int i = 0 ;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

public static void merge(int arr[], int si, int ei)
{
    if(si >=ei)
    {
        return;
    }
    int mid = si+(ei-si)/2;
    merge(arr, si, mid);
    merge(arr, mid+1, ei);
    mergehelper(arr,si,mid,ei);
}
public static void mergehelper(int arr[], int si, int mid, int ei)
{
    int temp[] = new int[ei-si+1];
    int i = si;
    int j = mid+1;
    int k=0;
    while(i<=mid && j<=ei)
    {
        if(arr[i]>arr[j])
        {
            temp[k] = arr[i];
            i++;
        }
        else
        {
            temp[k] = arr[j];
            j++;
        }
        k++;
    }
    while(i<=mid)
    {
        temp[k++] = arr[i++];
    }
    while(j<=ei)
    {
        temp[k++] = arr[j++];
    }
    for(k=0,i=si; k<temp.length;i++,k++)
    {
        arr[i] = temp[k];
    }
}

public static void quick(int arr[],int si , int ei)
{
    if(si>=ei)
    {
        return;
    }
    int index = partation(arr,si,ei);
    quick(arr, si, index-1);
    quick(arr, index+1, ei);
}
public static int partation(int arr[], int si, int ei)
{
    int pvoit = arr[ei];
    int i = si-1;
    for(int j = si; j<ei ;j++)
    {
        if(arr[j]<=pvoit)
        {
            i++;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    i++;
    int temp = pvoit;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
}

public static void selection(int arr[])
{
    for(int i =0;i<arr.length;i++)
    {
        int small = i;
        for(int j = i+1;j<arr.length;j++)
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
}

    public static void print(int arr[])
    {
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) 
    {
        int arr[] = {6, 5, 2, 3, 7, 8, 1,9};
        System.out.println("Original array: ");
        print(arr);
       // bubble(arr);
       //merge(arr, 0, arr.length-1);
       //quick(arr, 0, arr.length-1);
       //insertion(arr);
       selection(arr);
        System.out.println("Sorted array: ");
        print(arr);

    }
}