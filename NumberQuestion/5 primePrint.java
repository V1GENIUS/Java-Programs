package NumberQuestion;
 class primePrint {

    static boolean isPrime(int num)
    {
        if(num <=1 )
        {
            return false;
        }
        for(int i=2 ; i*i<=num ; i++)
        {
            if(num%i == 0 )
            {
                return false ;
            }
        }
        return true ;
    }


    public static void main(String []args)
    {
        int num = 100; 

        for(int i = 2 ; i<=num ; i++)
        {
           if(isPrime(num)) {
            System.out.print(num+" ");
           }

        }

    }

}
