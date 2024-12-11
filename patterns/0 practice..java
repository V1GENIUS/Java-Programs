package patterns;

class practice_0 {

    public static void main(String[] args) {
        int size = 10;
        for (int i = 1; i <= size; i++) {

            for (int j = size; j >= 1; j--) {
                if (i > j) {
                    System.out.print("#");

                } else {
                    System.out.print(i + "*");
                }
            }

            System.out.println();

        }

    }

}
