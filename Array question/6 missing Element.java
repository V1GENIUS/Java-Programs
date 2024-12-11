 class  missing_Element {
    public static void main(String[]args)
    {
        int arr[] = {1,2,3,4,5} ;
        int size = arr.length;
        int n = size+1;



        int sum = (n*(n+1))/2 ;
        int total = 0 ;
        

        for(int i=0 ; i<size ; i++)
        {
            total = total +arr[i];
            

        }
        int missing =sum - total ;

        System.out.println(+ missing );

        
    }
    
}
