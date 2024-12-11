
class Reverse_the_array {

    public static void main(String[] args) {

        int arr[] = {4,2,45,3,24};
        int n = arr.length;
        int size = n;

        for(int i=0 ; i<n/2 ;i++)
        {
            int temp = arr[i];
            arr[i] = arr[size-1];
            arr[size-1] = temp ;

            size--;

        }

        for(int i=0 ; i< n ; i++){
            System.out.print(arr[i] +" ");

        }
        



       
    }

}
