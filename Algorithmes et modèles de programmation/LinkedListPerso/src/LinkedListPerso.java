public class LinkedListPerso {
    public class Node {
        Object data;
        Node next;
        Node prev;

        public Node(Object data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

    public LinkedListPerso() {
        this.head = null;
        this.tail = null;
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    //searches for a node with the given data and prints it
    public void searchPrint(Object data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                System.out.println(current.data);
                return;
            }
            current = current.next;
        }
        System.out.println("No such data");
    }

    public Node search(Object data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }


}
