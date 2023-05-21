package arrayList_ctdl.myLinkedList;

import javax.xml.soap.Node;

public class MyLinkedList <E> {
    private Node head;
    private int numNodes;
    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }
    public class Node {
        public Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
        public Object getData() {
            return data;
        }
        public Node getNext(){
            return next;
        }
        public void setNext(Node next){
            this.next= next;
        }
    }
//    public void add(int index, E element) {
//        Node temp = head;
//        Node holder;
//
//        for(int i=0; i < index-1 && temp.next != null; i++) {
//            temp = temp.next;
//        }
//        holder = temp.next;
//        temp.next = new Node(element);
//        temp.next.next = holder;
//        numNodes++;
//    }
//    public void addFirst(E e) {
//        Node temp = head;
//        head =new Node(e);
//        head.next = temp;
//        numNodes++;
//    }
//    public void addLast(E e){
//
//    }
public void add(Object data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
    } else {
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
    }

    numNodes++;
}

    public void addFirst(Object data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }

        numNodes++;
    }

    public void addLast(Object data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }

        numNodes++;
    }

    public void remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }

            Node nodeToRemove = currentNode.getNext();
            currentNode.setNext(nodeToRemove.getNext());
        }

        numNodes--;
    }

    public void remove(Object data) {
        if (head == null) {
            return;
        }

        if (head.getData().equals(data)) {
            head = head.getNext();
            numNodes--;
            return;
        }

        Node currentNode = head;
        while (currentNode.getNext() != null) {
            if (currentNode.getNext().getData().equals(data)) {
                currentNode.setNext(currentNode.getNext().getNext());
                numNodes--;
                return;
            }
            currentNode = currentNode.getNext();
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode.getData();
    }

    public int size() {
        return numNodes;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    public MyLinkedList clone() {
        MyLinkedList newList = new MyLinkedList();

        Node currentNode = head;
        while (currentNode != null) {
            newList.addLast(currentNode.getData());
            currentNode = currentNode.getNext();
        }

        return newList;
    }

    public boolean contains(Object data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

}
