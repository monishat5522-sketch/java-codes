class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Main {
    static Node head;

    void insert(int data) {
        Node newnode = new Node(data); 
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp; 
    }

    void deleteEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    void displayForward() { 
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayBackward() { 
        if (head == null) return;
        
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
    
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) { 
        // FIXED: Instantiate the Main class, where the methods are defined
        Main list = new Main();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.print("Forward: ");
        list.displayForward(); 

        list.deleteEnd();

        System.out.print("After delete at end (Forward): ");
        list.displayForward();

        System.out.print("After delete at end (Backward): ");
        list.displayBackward();
    }
}
