class Insertion
{
    public static void main(String args[])
    {
        int arr[] = {12,34,21,19,35};
        int num,temp,i,j,temp1;
        for(i=1;i<arr.length;i++)
        {
            temp=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>=temp)
            {
               arr[j+1]=arr[j];
	j--;
            }
	//arr[j+1]=temp;
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}