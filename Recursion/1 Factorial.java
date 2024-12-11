package Recursion;

class fact {

    // static int pro = 1;

    int factorial(int n, int pro) {

        if (n != 1) {
            pro = pro * n;

        }
        factorial(n - 1, pro);

        return pro;
    }

    public static void main(String[] args) {

        fact fact = new fact();

        int n = 5;
        int pro = 1;

        fact.factorial(n, pro);
        System.out.println(pro);

        // System.out.println(fact.factorial(n));

    }

}