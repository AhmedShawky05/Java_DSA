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
