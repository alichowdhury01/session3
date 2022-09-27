
public class ListChainee {

    //Creer une classe Node qui contient les données et un pointeur vers le prochain noeud de la liste chainée 
    class Node {
        Ouvrage data;
        Node next;
        public Node(Ouvrage data) {
            this.data = data;
            this.next = null;
        }
    }

    //Creer head et tail de la liste chainee 
    public Node head = null;
    public Node tail = null;

    //inserer au debut de la liste chainee 
    public void insertAtStart(Ouvrage data) {
        //creer un newNode object
        Node newNode = new Node(data);
        //verifier si la liste est vide
        if (head == null) {
            //si la liste est vide, le nouveau noeud sera le premier noeud
            head = newNode;
            tail = newNode;
        } else {
            //newNode sera ajouté avant head de sorte que head pointe vers newNode
            Node temp = head;
            head = newNode;
            //newNode pointera vers temp comme prochain node
            head.next = temp;
        }
    }

    //insérer à la fin de la liste
    public void insertAtEnd(Ouvrage data) {
        //create a new node
        Node newNode = new Node(data);
        //verifier si la liste est vide
        if (head == null) {
            //si la liste est vide, le nouveau noeud sera le premier noeud 
            head = newNode;
            tail = newNode;
        } else {
            //newNode sera ajouté après tail de sorte que tail pointe vers newNode 
            tail.next = newNode;
            //newNode sera le nouveau noeud de fin de liste 
            tail = newNode;
        }
    }

    //insérer à une position donnée
    public void insertAt(int index, Ouvrage data) {
        //create a new node
        Node newNode = new Node(data);
        //verifier si la liste est vide
        if (head == null) {
            //si la liste est vide, le nouveau noeud sera le premier noeud
            head = newNode;
            tail = newNode;
        } else {
            //mettre le noeud courant à la position de tête
            Node current = head;
            Node previous = null;

            int i = 0;

            //verifier si l'index est valide 
            if (index == 0) {
                //insérer au début de la liste
                insertAtStart(data);
                return;
            }

            //parcourir la liste jusqu'à la position donnée
            while (i < index) {
                //stocker le node actuel et son node précédent car nous devons changer le prochain du courant
                previous = current;
                current = current.next;

                if (current == null) {
                    break;
                }

                i++;
            }

            //verifier si l'index est plus grand que le nombre de node dans la liste
            if (index > i) {
                //insere à la fin de la liste
                insertAtEnd(data);
            } else {
                //inserer à la position donnée
                //previous.Next pointe vers newNode
                previous.next = newNode;
                //newNode.next pointe vers current
                newNode.next = current;
            }
        }
    }

    //supprimer à une position donnée
    public void deleteAt(int index) {
        //verifier si la liste est vide
        if (head == null) {
            return;
        } else {
            //stocker le node current et son node previous car nous devons changer le next du current
            Node current = head;
            Node previous = null;

            int i = 0;

            //verifier si l'index est 0 
            if (index == 0) {
                //changer la tête de la liste
                head = head.next;
                return;
            }

            //parcourir la liste jusqu'à la position donnée
            while (i < index) {
                //stocker le node actuel et son node précédent car nous devons changer le prochain du courant
                previous = current;
                current = current.next;

                if (current == null) {
                    break;
                }

                i++;
            }

            //verifier si l'index est plus grand que le nombre de node dans la liste
            if (index > i) {
                //supprimer le dernier node de la liste 
                previous.next = null;
                tail = previous;
            } else {
                //supprimer le node à la position donnée
                //previous.next pointe vers current.next
                previous.next = current.next;
            }
        }
    }

    //supprimer à une position donnée
    public void deleteAt(Ouvrage data) {
        //verifier si la liste est vide
        if (head == null) {
            return;
        } else {
            //stocker le node current et son node previous car nous devons changer le next du current
            Node current = head;
            Node previous = null;

            //check if the data of head is the data to be deleted
            if (current.data == data) {
                //change head
                head = head.next;
                return;
            }

            //traverse through the list
            while (current != null) {
                //store the current node and its previous node as we need to change current's next
                previous = current;
                current = current.next;

                //check if the data of current node is the data to be deleted
                if (current.data == data) {
                    //change the next of previous node
                    previous.next = current.next;
                    return;
                }
            }
        }
    }

    //display the list
    public void display() {
        //Node current will point to head
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //search for a given data
    public boolean search(Ouvrage data) {
        //Node current will point to head
        Node current = head;
        //checks whether the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return false;
        }
        while (current != null) {
            //compare each node with given data
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //delete the entire list
    public void deleteList() {
        //Node current will point to head
        Node current = head;
        //Node next will point to node next to current
        Node next = null;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            //Store the next node
            next = current.next;
            //Make next of current as null
            current.next = null;
            //Make current as next
            current = next;
        }
        //Make head as null
        head = null;
    }

    public void deleteFromStart() {
        //check if the list is empty
        if (head == null) {
            return;
        } else {
            //check if the list contains only one element
            if (head != tail) {
                //head will point to next node in the list
                head = head.next;
            }
            //if the list contains only one element
            //then it will remove it and both head and tail will point to null
            else {
                head = tail = null;
            }
        }
    }




    
}
