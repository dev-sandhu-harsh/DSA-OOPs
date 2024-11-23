package DataStructureImplementation.LinkedList;

class Node<T> {
    T data;
    Node next;

    public Node(T data){
        this.data = data;
    }
}
public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size = 0;

    //ADDITION
    public void addFirst(T value){
        Node<T> newnode = new Node<T>(value);
        if(head == null){
            head = newnode;
            tail = newnode;
        }else{
            newnode.next = head;
            head = newnode;
        }
        size++;
    }
    public void addLast(T value){
        Node<T> newnode = new Node<T>(value);
        if(head == null){
            head = newnode;
            tail = newnode;
        }else{
            tail.next = newnode;
            tail = tail.next;
        }
        size++;
    }

    //REMOVAL
    public T removeFirst(){
        if(head == null){
            throw new Exception("List is Empty");
        }
        Node currHeadNode = head;
        head = head.next;
        size--;
        return currHeadNode.data;
    }
    public T removeLast(){
        if(head == null || tail == null){
            throw new Exception("List is Empty");
        }
        if(head.next == null || head == tail){
            Node currNode = tail;
            tail = head = null;
            size--;
            return currNode.data;
        }
        var itrNode = head;
        while(itrNode.next.next != null){
            itrNode = itrNode.next;
        }
        Node currLastNode = itrNode.next;
        itrNode.next = null;
        tail = itrNode;
        size--;
        return currLastNode.data;
    }

    //PEEK
    public T peekFirst(){
        if(head == null){
            throw new Exception("List is Empty");
        }
        return head.data;
    }
    public T peekLast(){
        if(head == null || tail == null){
            throw new Exception("List is Empty");
        }
        return tail.data;
    }

    //SIZE
    public int size(){
        return size;
    }

    public void print(){
        if(head == null){
            System.out.println("Empty Linked List");
            return;
        }
        Node iter = head;
        while(iter.next!=null){
            System.out.print(iter.data+"->");
            iter = iter.next;
        }
        System.out.println(iter.data);
    }
}
