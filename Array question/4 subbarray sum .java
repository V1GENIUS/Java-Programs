class subbarray_sum {
    public static void main(String args[]) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = arr.length;
        int sum = 0;
        int max = -1;
        // 1st approach time complexity ~~n(N^3);
        // for (int i = 0; i <= n - 1; i++) {
        // // sum = 0;
        // for (int j = 0; j <= n - 1; j++) {
        // sum = 0;
        // for (int k = i; k < j; k++)
        // sum += arr[k];
        // max = Math.max(max, sum);
        // }

        // }

        for (int i = 0; i <= n - 1; i++) {
            sum = 0;
            for (int j = 0; j <= n - 1; j++) {
                // sum = 0;
                // for (int k = i; k < j; k++)
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }

        System.out.println("maximum length is:" + max);
    }

}
