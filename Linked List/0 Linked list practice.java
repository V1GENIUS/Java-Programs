import java.util.LinkedList;

class practice {

    class dataNode {
        int data;
        dataNode next;

        public dataNode(int data) {
            this.data = data;
            this.next = null;

        }

        public static dataNode head;
        public static dataNode tail;

        public static void main(String[] args) {

            LinkedList l = new LinkedList();

            l.add("vivek");
            l.add(1);
            l.add(2);
            l.add(3);
            l.add(4);
            l.add(5);
            l.add(6);

            dataNode newnode = null;

            while (head != null) {
                dataNode next = head.next;
                head.next = newnode;
                newnode = head;
                head = next;
            }

        }

        // System.out.println(l);

    }
}
