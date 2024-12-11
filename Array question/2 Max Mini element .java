class Max_Mini_element {

    public static void main(String[] args) {
        int arr[] = { 3, 8, 33, 6, 22, 78, 32 };
        int mini = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (mini > arr[i]) {
                mini = arr[i];
            }
        }

        System.out.println("mini = " + mini + "  max = " + max);

    }
}
