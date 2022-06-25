/*
LinkedList
    add
    set
    remove
    clear
    indexOf
    lastIndexOf
    contains

LinkedList as Queue
    peek
    poll
    offer

LinkedList as Deque
    add
    addLast
    addFirst
    getFirst
    getLast
    removeFirst
    removeLast
*/

package LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        //Adding elements
        ll.add("Element 1");
        ll.add("Element 2");
        ll.add("Element 3");
        ll.add("Element 4");
        ll.add("Element 5");
        ll.add("Element 6");

        System.out.println(ll.get(1));  //Get Element

        ll.set(3, "Updated Element 4");   //Update Element
        System.out.println(ll.get(3));

        ll.remove(4);   //Remove Element
        System.out.println(ll); //Print Linked List

        System.out.println(ll.contains("Element 9"));   //checks if the LinkedList contains the element

        System.out.println(ll.indexOf("Element 2"));    //returns the index of the first occurrence of the element
        System.out.println(ll.lastIndexOf("Element 2"));    //returns the index of the last occurrence of the element

        ll.clear();     //removes all the elements of the LinkedList

        System.out.println("------------------------------------------------------");
        //LinkedList as Queue

        Queue<String> q = new LinkedList<>();
        //Adding elements
        q.add("QElement 1");
        q.add("QElement 2");
        q.add("QElement 3");
        q.add("QElement 4");
        q.add("QElement 5");
        q.add("QElement 6");

        System.out.println(q.peek());       //returns the first element (head) of the linked list

        System.out.println(q.poll());       //returns and removes the first element from the linked list
        System.out.println(q);

        q.offer("hello");       //adds the specified element at the end of the linked list
        System.out.println(q);

        System.out.println("------------------------------------------------------");
        //LinkedList as Deque

        Deque<String> dQ = new LinkedList<>();

        dQ.add("Element 1");
        dQ.addLast("Element 2");
        dQ.addLast("Element 3");        //adds the specified element at the end of the linked list
        dQ.addFirst("Element 4");       //adds the specified element at the beginning of the linked list
        dQ.addFirst("Element 5");

        System.out.println(dQ);

        System.out.println(dQ.getFirst());      //returns the first element

        System.out.println(dQ.getLast());       //returns the last element

        dQ.removeFirst();       //removes the first element
        System.out.println(dQ);

        dQ.removeLast();        //removes the last element
        System.out.println(dQ);
    }
}