package NumberQuestion;

 class primeNumber {

    public static void main(String[]args)
    {
        int n= 131 ;

        for(int i=2 ; i<=n/2;i++)
        {
            if(n%i == 0)
            {
                System.out.println("not prime");
                break;
            }

        }
 }
    
}
