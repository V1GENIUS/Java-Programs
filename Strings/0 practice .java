package Strings;

class practice {
    public static void main(String[] args) {
        String input = "ABCDYBA";
        String result = makePalindrome(input);
        System.out.println("Palindrome: " + result);
    }

    public static String makePalindrome(String str) {
        int n = str.length();

        // Start checking from the original string
        for (int i = 0; i < n; i++) {
            if (isPalindrome(str)) {
                return str; // Return if the string is already a palindrome
            }

            // Append the character at the beginning to the end
            str += str.charAt(i);
        }

        return str;
    }

     // Check if a string is a palindrome
     public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    


    // public static void main(String[] args) {

    // String str = "welcome to webkorps";
    //    char [] arr =str.toCharArray();

    //    int j,k,tempI;
    //    System.out.println(arr.length);
    //    for(int i=0;i<str.length();i++){
    //     j=i;
    //     while (j!= arr.length && arr[j]!=' ') {
    //         j++;
    //     }
    //     tempI =j;
    //     --j;
    //     k=i;
    //     while(k<j){
    //         char temp =arr[k];
    //         arr[k]=arr[j];
    //         arr[j]=temp;
    //         k++;
    //         j--;
    //     }
    //     i=tempI;
    //    }
    //    int i=0;
    //    j=arr.length-1;
    //    while (i<j) {
    //     char temp = arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    //     i++;j--;
    //    }
    //    str = new String(arr);
    //    System.out.println(str);

    // }

}
