import java.sql.SQLOutput;

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

public void append(int value){
        Node newnode=new Node(value);
    if(length==0){
        head=newnode;
        tail=newnode;
    }
    else {
        tail.next = newnode;
        tail = newnode;
    }
    length++;
}


public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.next;

        }
        System.out.print("Null");
}


public void getHead(){
    System.out.println("\nHead: "+head.value);
}
public void getTail(){
    System.out.println("\nTail: "+tail.value);
    }
public void getLength() {
    System.out.println("\nLength: "+length);
}



}
