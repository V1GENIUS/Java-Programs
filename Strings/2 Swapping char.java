package Strings;

class Swapping_char {
    public static void main(String[] args) {
        // String str = "vivvke";
        // using Using subString(): method --->>>>>>>>
        // """"""""""""""""""""""""""""""""""""""""""""
        String str = "Hello";
        String firstChar = str.substring(0, 2);
        String secondChar = str.substring(1, 2);
        String subStr = firstChar + secondChar;

        System.out.println(subStr);









        

        // Using String builder swapping character
        // """"""""""""""""""""""""""""""""""""""""""""""""""
        StringBuilder sb = new StringBuilder("vek");
        sb.setCharAt(0, 'h');
        sb.setCharAt(1, 'e');
        String newStr = sb.toString();

        System.out.println(newStr);
    }

}
