public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
    int value;
    Node next;
    Node(int value){
       this.value=value;
   }
}

public LinkedList(int value){
        Node newnode=new Node(value);
        head=newnode;
        tail=newnode;
        length=1;
}



public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;

        }

}



}
