
import java.util.Scanner;

public class linked_List {

    Node head;

    static class Node {
        int data;
        Node next;

        //Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    //Method to create a new node
    public static linked_List insert(linked_List list, int data){
        Node new_node = new Node(data);

        if (list.head == null){
            list.head = new_node;
        } else{
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            //Inserts the new_node at the 'last' node
            last.next = new_node;
        }
        return list;
    }
}
