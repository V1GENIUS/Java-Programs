package patterns;

class Inc_Left_rev_triangle {
    public static void main(String[] args) {
        int size = 40;
        for (int i = 10; i <= size; i++) {

            for (int j = size; j >= 10; j--) {
                if (i > j) {
                    System.out.print(" ");

                } else {
                    System.out.print(i + " ");
                }
            }

            System.out.println();

        }

    }

}
