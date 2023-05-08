package arrayList_ctdl.myLinkedList;

import javax.xml.soap.Node;

public class MyLinkedList <E> {
    private Node head;
    private int numNodes;
    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }
    public class Node {
        public Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(E e) {
        Node temp = head;
        head =new Node(e);
        head.next = temp;
        numNodes++;
    }
    public void addLast(E e){
        
    }

}
