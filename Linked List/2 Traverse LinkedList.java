import java.util.LinkedList;

class TraverseLinkedList {

    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();

        list.add("shriyansh");
        list.add("Divyanshi");
        list.add("vivek");
        list.add("rathore");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
