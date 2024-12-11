package patterns;

class numDec_triangle {
    public static void main(String[] args) {
        int size = 9;
        for (int i = size; i >= 1; i--) {

            for (int j = 1; j <= size; j++) {
                if (i >= j) {
                    System.out.print(i + " ");

                } else {
                    System.out.print("# ");
                }
            }

            System.out.println();

        }
    }
}
