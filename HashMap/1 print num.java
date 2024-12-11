package HashMap;

import java.util.HashMap;

class print_num {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "vivek");
        map.put(2, "vive");

        System.out.println(map);

        System.out.println(map.get(1));

    }

}
