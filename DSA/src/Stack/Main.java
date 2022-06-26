/*
Push
Pop
Peek
isEmpty
Search
Size
Iterator
 */

package Stack;

import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        //Adding Element
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);

        //Deleting Element
        s.pop();
        System.out.println(s);

        //Peek Operation
        System.out.println(s.peek());

        //isEmpty (boolean)
        System.out.println(s.isEmpty());

        //Search    (index)
        System.out.println(s.search(3));

        //Size
        System.out.println(s.size());

        //Iterator
        Iterator i = s.iterator();
        while (i.hasNext()) {
            Object o = i.next();
            System.out.print(o + " ");
        }
    }
}