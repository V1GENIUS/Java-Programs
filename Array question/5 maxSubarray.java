class maxSubarray {

    public static void main(String args[]) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int size = arr.length;
        int current = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            current = arr[i] + current;
            if (current < 0) {
                current = 0;
            }
            maxsum = Math.max(current, maxsum);
        }

        System.out.println("max sum is :" + maxsum);

    }

}
