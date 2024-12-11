import java.util.LinkedList;

class node {

    // int data;
    // node next;

    // public node(int data) {
    // this.data = data;
    // this.next = next;

    // }

    // public static node head ;
    // public static node tail ;

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(32);
        list.add(6);
        list.add(7);

        list.add(4);
        list.add(9);
        list.add(8);
        list.add(22);

        System.out.println("Adding the element ");
        System.out.println(list);

        list.remove(5);
        System.out.println("Remove an element :");
        System.out.println(list);

        System.out.println("Getting an element :");
        System.out.println(list.get(4));

        list.set(5, 9);
        System.out.println("Update an element :");
        System.out.println(list);

    }

}
