package Strings;

 class palindromCheck {
    public static void main(String[]args)
    {
        String str = "abcc3ba";
        int size  = str.length();
        int flag = 0;

        for(int i=0 ; i < str.length()/2 ; i++)
        {
            if(str.charAt(i) != str.charAt(size-1))
            {
                flag = 1;

            }
            size--;

        }
        
       if(flag==1)
       {
        System.out.println("not palindrome");
       }
       else{
        System.out.println("palindrome");
       }

    }
    
}
