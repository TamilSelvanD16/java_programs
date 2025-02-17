class duplicate
{
    public static void main(String args[])
    {
            int arr[]={3,2,3,1,2,9};
            int n = arr.length;
            int count=0;
            int j;
            for(int i=0;i<n;i++)
            {
                for(j=0;j<count;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        break;
                    }
                }
                if(j==count)
                {
                    arr[count++]=arr[i];
                }
            }
            for(int i=0;i<count;i++)
            {
                System.out.print(arr[i]);
                
                System.out.print(" ");
            }
           
    }
}
