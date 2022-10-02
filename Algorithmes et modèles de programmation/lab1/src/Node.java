public class Node {
    int cote;
    Node next;
    Node prev;
    Ouvrage data;

    public Node(Ouvrage data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node(int cote) {
        this.cote = cote;
        this.next = null;
        this.prev = null;
    }


}
