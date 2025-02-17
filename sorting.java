class sorting{
    public static void main(String args[]){
        int arr[]={1,1,0,1,1,0,1,1,0,1};
      int temp=0;

      for(int i=0; i<arr.length;i++)
      {
          if(arr[i]==1){
            temp++;  
          }
      }
          for( int i=0;i<arr.length;i++)
          {
              if(i<temp){
                  arr[i]=1;
              }
              else{
                  arr[i]=0;
              }
          }
          
      
          
            for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
}
}     
      

