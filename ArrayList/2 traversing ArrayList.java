package ArrayList;

import java.util.ArrayList;

class traverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(7);
        list.add(8);
        list.add(2);
        list.add(9);
        int n = list.size();

        for (int i = 0; i < n; i++) {
            int temp = list.get(i);
            list.set(i, list.get(n - 1));
            list.set(n - 1, temp);

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}