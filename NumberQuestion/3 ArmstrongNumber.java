package NumberQuestion;

// Armstrong Means  1634 = 1^4 + 6^4 + 3^4 + 4^4 if both equal then Armstrong number

 class ArmstrongNumber {


    int exp(int num , int counts)
    {
        while(counts>0)
        {
            num = num*counts;
            counts--;

        }
        return num ;
    }


    public static void main(String[]args)
    {
        int num = 153;
        int n = num ;
        int count = 0;
        int armstrong = num;

        while(num>0)
        {
            count++;
            num = num/10;
        }
       
int sum = 0 ;
        while(n>0)
        {
            int temp = n%10;

            sum += Math.pow(temp, count);

            n = n/10;

        }

       
        // System.out.println(sum);

        if(sum == armstrong)
        {
            System.out.println("it is armstrong");
        }else{
            System.out.println("it is not armstrong");
        }
    }
    
}
