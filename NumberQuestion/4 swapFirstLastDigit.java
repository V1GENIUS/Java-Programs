package NumberQuestion;

 class swapFirstLastDigit {
    public static void main(String[]args)
    {
        int num = 39392;// 29393
        int n = num;

        int last = num%10;
        while(num>10)
        {
            num = num/10;
        }
        int first = num ;
        last= last*10000;
        first = first + last;

        System.out.println(first);


    }
    
}
