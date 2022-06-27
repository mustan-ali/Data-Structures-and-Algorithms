/*
enQueue
deQueue
 */

package Queue;

public class Main {
    public static void main(String[] args) {
        queueUsingArray qua = new queueUsingArray(5);
        qua.enQueue(1);
        qua.enQueue(2);
        qua.enQueue(4);
        qua.enQueue(8);
        qua.enQueue(16);
        qua.display();

        qua.deQueue();
        qua.deQueue();
        qua.display();
    }
}

class queueUsingArray {
    int frontQ, rearQ;
    int capacity;
    int[] q;

    queueUsingArray(int size) {
        this.capacity = size;
        q = new int[capacity];
    }

    void enQueue(int value) {
        if (rearQ == capacity) {
            System.out.println("Queue is full.");
        } else {
            q[rearQ] = value;
            rearQ++;
        }
    }

    void deQueue() {
        if (rearQ == 0) {
            System.out.println("Queue is empty.");
        } else {
            for (int i = 0; i < rearQ - 1; i++) {
                q[i] = q[i + 1];
            }
            rearQ--;
        }
    }

    void display() {
        if (rearQ == 0) {
            System.out.println("Queue is empty.");
        } else {
            for (int i = 0; i < rearQ; i++) {
                System.out.print(q[i] + " ");
            }
            System.out.println("\n");
        }
    }
}