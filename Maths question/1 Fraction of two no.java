
class FractionOfTwo_no {

    public static void main(String[] args) {

        int num1 = 3, num2 = 1;
        int deno1 = 9, deno2 = 10;

        int num = num1 * deno2 + num2 * deno1;
        int deno = deno1 * deno2;

        // shivani this is for gcd smjha jaana ollad

        int gcd = 0;
        for (int i = 1; i <= num && i <= deno; i++) {
            if (num % i == 0 && deno % i == 0) {
                gcd = i;

            }
        }
        // num = num/gcd ;

        System.out.println(num / gcd + "/" + deno / gcd);

    }

}
