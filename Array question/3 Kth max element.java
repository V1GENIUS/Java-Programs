import java.util.Arrays;

class Kth_max_element {

    public static void main(String[] args) {
        int arr[] = { 5, 8, 22, 87, 43, 65, 3, 5 };
        int k = 3;

        Arrays.sort(arr);

        System.out.println(arr[arr.length - k]);
    }

}
