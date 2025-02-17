public class printarray2
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int max1=arr[0];
        int max2=arr[0];
        int max3=arr[0];
        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]>max1){
               max1=arr[i];
           }
        }
        System.out.println("max1 : " + max1);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max2 & arr[i]!=max1)
            {
                max2=arr[i];
            }
        }
        System.out.println("max2 : " + max2);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max3 & arr[i]!=max1 & arr[i]!=max2)
            {
                max3=arr[i];
            }
        }
        System.out.println("max3 : " + max3);
    }
}

    
       

        