 class countMinNumberOfNotes {
    public static void main (String[]args)
    {
        int n = 4553 ;
        int count = 0 ; 
         

         while(n>0)
         {
            if(n>=2000)
            {
                count = count + n/2000;
                n = n % 2000;

            }else if(n>=500)
            {
                count = count + n/500;
                n = n % 500;
            }
            else if(n>=200)
            {
                count = count + n/200;
                n = n % 200;
            }
            else if(n>=100)
            {
                count = count + n/100;
                n = n % 100;
            }
            else if(n>=50)
            {
                count = count + n/50;
                n = n % 50;
            }
            else if(n>=20)
            {
                count = count + n/20;
                n = n % 20;
            }
            else if(n>=10)
            {
                count = count + n/10;
                n = n % 10;
            }
            else if(n>=5)
            {
                count = count + n/5;
                n = n % 5;
            }
            else if(n>=1)
            {
                count = count + n/1;
                n = n % 1;
            }

         }

         System.out.println(count);

    }
}
