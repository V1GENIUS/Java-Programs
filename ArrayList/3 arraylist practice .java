package ArrayList;

import java.util.ArrayList;

class vinay {
    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<>();

        list.add("vivek ");
        list.add("rathore ");
        list.add("don ");
        list.add("is impressed ");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        // System.out.println("the linked list are : " + list);

    }

}
