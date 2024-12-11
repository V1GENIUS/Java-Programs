import java.util.LinkedList;

class traversereverse {

    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();

        list.add("mona darling ");
        list.add("ashish");

        for (int i = 0; i < list.size() / 2; i++) {
            System.out.println(list.get(i));

            String temp = list.get(i);
            list.set(list.get(i), list.size() - i);// = list.get(list.size()-i);

        }
    }

}
