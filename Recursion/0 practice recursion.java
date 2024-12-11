package Recursion;
class recurs{

    void nat(int n){

        if(n==5)
        {
            return ;
        }
        nat(n-1);
    }
    public static void main(String[]args)
    {
        int n=5 ;

        recurs natural = new recurs();

        natural.nat(n);
    }
}