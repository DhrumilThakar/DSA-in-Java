public class merge_sort 
{
    public static void print(int arr[])
    {
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void merge(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid = si+(ei-si)/2; //(si+ei)/2;
        merge(arr, si, mid); //left
        merge(arr, mid+1, ei); //right
        mergehelper(arr,si,mid,ei);
    }
    public static void mergehelper(int arr[],int si,int mid,int ei)
    {
        int[] temp = new int[ei-si+1]; //Coz array index start from 0 etel video ma kidhu e prmanae 
        int i=si; //Iterator for left part.
        int j = mid+1; //Iterator for right part.
        int k = 0; //Iterator for temperaroy array.
        while (i<=mid && j<=ei) 
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //For leftover element for left
        while (i<=mid) 
        {
          temp[k++]=arr[i++];  
        }
        //For leftover element for right
        while (j<=ei) 
        {
         temp[k++] = arr[j++];   
        }

        //Copy temperaroy array to oringal array
        for(k=0,i=si;k<temp.length;i++,k++)
        {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int[] arr={6, 3, 9, 5, 2, 8};
        merge(arr, 0, arr.length-1);
        print(arr);
    }
} 