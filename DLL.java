class Node {
    int value;
    Node next;
    Node prev;

    Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

public class DLL {

    Node head;

    // Insert at Beginning
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert at End
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at Specific Position
    public void insertAtSpecificPosition(int value, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            insertAtBeginning(value);
            return;
        }

        Node newNode = new Node(value);
        Node temp = head;

        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    // Delete at Beginning
    public void deleteAtBeginning() {
        if (head == null) return;

        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    // Delete at End
    public void deleteAtEnd() {
        if (head == null) return;

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

    // Display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            if (temp.next != null) System.out.print(" <-> ");
            temp = temp.next;
        }
        System.out.println(" -> null");
    }

    // Main method
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertAtBeginning(100);
        list.insertAtBeginning(200);
        list.insertAtBeginning(300);
        list.insertAtBeginning(400);

        list.insertAtEnd(700);
        list.insertAtEnd(800);
        list.insertAtEnd(1000);

        list.insertAtSpecificPosition(650, 3);

        list.deleteAtEnd();
        list.deleteAtBeginning();

        list.display();
    }
}