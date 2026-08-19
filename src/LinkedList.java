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


public Node removeLast() {
    if (length == 0) {
        return null;
    }
        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
    if(length==0){
        head=null;
        tail=null;
    }

    return temp;
}


public void prepend(int value){
        Node newnode=new Node(value);
        if(length==0){
            head=newnode;
            tail=newnode;
        }else{
            newnode.next=head;
            head=newnode;
        }
        length++;
}



    public Node removeFirst(){
        if(length==0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
    }

public Node get(int index){
        if(index<0 || index>=length){
            return null;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
    return temp;
}






public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.next;

        }
        System.out.print("Null\n");
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
