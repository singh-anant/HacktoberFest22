import java.util.*;
public class LinkedList 
{
    static class Node{
        int data;
        Node next;
    }
    static class Single{
        static Node head;
        static Node tail;
        static int size;
        public static Node create(int value)
        {
            head = new Node();
            Node node = new Node();
            node.next = null;
            node.data = value;
            head = node;
            tail = node;
            size = 1;
            return head;
        }

        public static void Insert(int value, int p)
        {
            Node node = new Node();
            node.data = value;
             if(head == null)
             {
                 create(value);
                 return;
             }
             else if(p == 0)
             {
                 node.next = head;
                 head = node;
             }
             else if(p >=size)
             {
                 node.next = null;
                 tail.next = node;
                 tail = node;
             }
             else{
                 Node temp = head;
                 int i=0;
                 while(i<p-1)
                 {
                     temp = temp.next;
                     i++;
                 }
                 Node nextN = temp.next;
                 temp.next = node;
                  node.next = nextN ;
             }
              size++;
        }

        //traversal

        public static void traverse()
        {
            if(head == null)
            {
                System.out.println("Empty");
            }
            else{
                Node temp = head;
                for(int i=0;i<size;i++)
                {
                    System.out.print(temp.data+" ");
                  temp = temp.next;
                }
            }
            System.out.println();
        }

        public static void reverse()
        {
            if(head.next == null || head == null)
            {
                return;
            }
           Node prev = head;
            Node current = head.next;
            while(current != null)
            {
                Node nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            head.next = null;
            head = prev;
        }

    }
    public static void main(String args[])
     {
        Single list = new Single();
      list.create(5);
      list.Insert(6, 1);
      list.Insert(4, 2);
      list.Insert(11, 3);
      list.Insert(7, 4);
      //System.out.println(list.head.next.data);
      list.traverse();
        list.reverse();
      list.traverse();
     

    }
}