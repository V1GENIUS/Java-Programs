package patterns;

class left_reverse_triangle {

    public static void main(String[] args) {
        int size = 10;
        for (int i = size; i >= 1; i--) {

            for (int j = 1; j <= size; j++) {
                if (i <= j) {
                    System.out.print(" ");

                } else {
                    System.out.print("# ");
                }
            }

            System.out.println();

        }
    }

}
