public class ListChainee   {

    //Attributs
    Node head;
    Node tail;
    int size;

    //Constructeur
    public ListChainee() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Méthodes add 
    public void add(Ouvrage o) {
        Node node = new Node(o);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    //search method by cote number and return the book if found or say not found if not found
    public Ouvrage search(int cote) {
        Node current = head;
        while (current != null) {

            if (current.data.getCote() == cote) {
                System.out.println("The book with cote " + cote + " has been found at position " + current.data);
                return current.data;
            }
            current = current.next;
        }
        System.out.println("The book with cote " + cote + " has not been found");
        return null;
    }


    //delete method
    public Ouvrage delete(int cote) {
        Node current = head;
        while (current != null) {
            if (current.cote == cote) {
                if (current == head) {
                    head = head.next;
                    head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return current.data;
            }
            current = current.next;
        }
        return null;
    }





}
