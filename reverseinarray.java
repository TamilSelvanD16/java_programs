class reverseinarray
{
    public static void main(String args[])
    {
            int arr[]={1,2,3,4,5,6};
            int n=3;
            for(int i=n-1;i>=0;i--)
            {
                System.out.print(arr[i]);
            }
            for(int i=arr.length-1;i>=n;i--)
            {
                System.out.print(arr[i]);
            }
    }
}

    
      

