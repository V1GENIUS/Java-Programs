import java.util.LinkedList;

class dataNode {
    int data;
    dataNode next;

    public dataNode(int data) {

        this.data = data;
        this.next = null;

    }

    public static dataNode head;
    public static dataNode tail;

}

class vivekkl {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        dataNode head = new dataNode(1);

        head.next = new dataNode(4);

        System.out.println(list);

        // list.head = new node(1);
        // list.head.next = new node(4);

    }

}
/*
 * class node {
 * 
 * int data;
 * node next;
 * 
 * public node(int data) {
 * this.data = data;
 * this.next = next;
 * 
 * }
 * public static node head;
 * public static node tail;
 * 
 * // public void addLast(int data)
 * // {
 * // node newnode = new node(data);
 * 
 * // if(head == null)
 * // {
 * // head= tail ;
 * // }
 * 
 * // tail.next = newnode ;
 * // tail = newnode ;
 * // }
 */
