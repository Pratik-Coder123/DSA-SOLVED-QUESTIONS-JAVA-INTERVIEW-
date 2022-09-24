public class LL {

    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }

    public void insert(int p, int value) {

        Node newnode = new Node(value);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
        p = 3;
        value = 10;

        Node temp = head;

        for (int i = 0; i < p - 1; i++) {

            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    // public void deletefirst() {
    // if (head == null) {
    // System.out.println("List is empty");
    // return;
    // }
    // size--;
    // head = head.next;
    // }

    // public void deletelast() {
    // if (head == null) {
    // System.out.println("List is empty");
    // return;
    // }
    // size--;
    // if (head.next == null) {
    // head = null;
    // return;
    // }
    // Node secondlast = head;
    // Node lastnode = head.next;
    // while (lastnode.next != null) {
    // lastnode = lastnode.next;
    // secondlast = secondlast.next;
    // }
    // secondlast.next = null;
    // }

    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "-> ");
            currnode = currnode.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(4);
        list.addfirst(5);
        list.printlist();

        list.addlast(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);
        list.printlist();

        // list.deletefirst();
        list.printlist();

        // list.deletelast();
        list.insert(3, 12);

        System.out.println(list.getSize());
    }
}
