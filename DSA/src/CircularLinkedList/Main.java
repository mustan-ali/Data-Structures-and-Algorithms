/*
Insert
Delete
Display
 */

package CircularLinkedList;
public class Main {
    public static void main(String[] args) {

        Main cll = new Main();
        cll.insertElement(1);
        cll.insertElement(2);
        cll.insertElement(3);
        cll.insertElement(4);
        cll.insertElement(5);

        cll.displayElements();

        System.out.println("\n");

        cll.deleteElement();
        cll.displayElements();
    }

    Node head, tail;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void insertElement(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void displayElements() {
        Node n1 = head;
        if (tail == null && head == null) {
            System.out.println("Circular Linked List is empty.");
        } else {
            do {
                System.out.print(n1.data + " ");
                n1 = n1.next;
            } while (n1 != head);
        }
    }

    void deleteElement() {
        if (tail != head) {
            head = head.next;
            tail.next = head;
        } else {
            head = tail = null;
        }
    }
}