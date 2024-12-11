class vivekws {

    static int pow(int exp, int result, int bass) {
        while (exp != 0) {
            result *= bass;
            exp--;
        }
        return result;
    }

    static int countdigit(int n, int count) {
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        return count;
    }

    public static void main(String main[]) {
        int exp = 2;
        int bass = 3;
        int result = 1;
        int count = 0;

        int powresult = pow(exp, result, bass);

        System.out.println(result);

    }
}