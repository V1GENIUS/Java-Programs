class rotate_array{
    public static void main(String []args)
    {
        int arr[] = {2,4 ,3,42,53 ,2,5,8};
        int k = 17;
        if(k>arr.length)
        {
            k=k%arr.length;
        }
       

        for(int i=0 ; i<k ; i++)
        {
            int first = arr[0];
            for(int j=0 ; j<arr.length-1 ; j++){
                arr[j]= arr[j+1];
            }

            arr[arr.length-1]= first ;
        }


        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}