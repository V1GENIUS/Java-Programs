package Strings;

import java.util.Scanner;

class String_to_char_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String :");
        String str = sc.nextLine();

        System.out.println(str);

        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
