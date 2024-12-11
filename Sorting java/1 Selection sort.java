class SelectionSort {

    public static void main(String[] args) {

        // int []arr = new int[6];

        int arr[] = { 7, 0, 1022, 3, 5, 111 };
        // int mini;

        for (int i = 0; i < arr.length - 1; i++) {
            int mini = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }

            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",  ");
        }

    }
}
