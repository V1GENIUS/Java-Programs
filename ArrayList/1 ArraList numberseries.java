package ArrayList;

import java.util.ArrayList;

/*class vivekw()
{
    public static void main(String args[])
    {
        
    }
}
*/
class Numberseries {
    void number(int n, ArrayList<Integer> arr) {
        if (n < 0) {
            return;
        }
        arr.add(n);
        number(n - 1, arr);

    }
}

class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        Numberseries n = new Numberseries();

        n.number(5, arr);

        System.out.println(arr);

    }
}
