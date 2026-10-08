public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value=value;
        }
    }

    public DoublyLinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    public void append(int value){
        Node newNode=new Node(value);
         if(length==0){
             head=newNode;
             tail=newNode;
         }
         else{
             tail.next=newNode;
             newNode.prev=tail;
             tail=newNode;
         }
        length++;
    }

    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp=tail;
        if(length==1){
            head=null;
            tail=null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        length++;
    }

    public void display(){
        Node temp=head;
        System.out.print("NUll <-> ");
            while(temp!=null){
                System.out.print(temp.value + " <-> ");
                temp=temp.next;
            }
            System.out.print("NUll\n");
    }


    public void getHead() {
        System.out.println("\nHead: " + head.value);
    }

    public void getTail() {
        System.out.println("\nTail: " + tail.value);
    }

    public void getLength() {
        System.out.println("\nLength: " + length);
    }

}
