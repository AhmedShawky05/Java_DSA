import java.sql.SQLOutput;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newnode = new Node(value);
        head = newnode;
        tail = newnode;
        length = 1;
    }

    public void append(int value) {
        Node newnode = new Node(value);
        if (length == 0) {
            head = newnode;
            tail = newnode;
        } else {
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
        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }


    public void prepend(int value) {
        Node newnode = new Node(value);
        if (length == 0) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        length++;
    }


    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }


    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newnode = new Node(value);
        Node temp = get(index - 1);
        newnode.next = temp.next;
        temp.next = newnode;
        length++;
        return true;
    }


    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }
        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp.next;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;

        }
        System.out.print("Null\n");
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


// ===== Problem Solving =====

    public Node FindMiddleNode() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }


    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }


    public Node findKthFromEnd(int k) {
        Node slow = head;
        Node fast = head;

        if (k <= 0) {
            return null;
        }


        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }


        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }



    public void removeDuplicates() {
        Node current = head;

        while (current != null) {

            Node prev = current;
            Node runner = current.next;

            while (runner != null) {

                if (current.value == runner.value) {
                    prev.next = runner.next;
                    runner = prev.next;
                }
                else {
                    prev = runner;
                    runner = runner.next;
                }
            }

            current = current.next;
        }
    }


    public int binaryToDecimal(){
        int num = 0;
        Node current=head;

        while(current!=null){
            num=num*2+current.value;
            current=current.next;
        }

    return num;
    }


    public void partitionList(int x){
        Node Dummy1= new Node(0);// list contains numbers less than x
        Node Dummy2= new Node(0);// list contains numbers greater than or equal to x
        Node prev1=Dummy1;
        Node prev2=Dummy2;
        Node temp=head;
        while(temp!=null){
            if(temp.value < x){
                prev1.next=temp;
                temp=temp.next;
                prev1=prev1.next;
            } else {
                prev2.next=temp;
                temp=temp.next;
                prev2=prev2.next;

            }

        }
        prev1.next=Dummy2.next;
        prev2.next=null;
        head=Dummy1.next;
    }



    public void reverseBetween(int m, int n) {
        Node Dummy=new Node(0);
        Node prev=Dummy;
        Dummy.next=head;
        for(int i=0;i<m;i++){
            prev=prev.next;
        }
        Node current =prev.next;

        for(int i=0;i < n - m;i++){
            Node toMove=current.next;
            current.next=toMove.next;
            toMove.next=prev.next;
            prev.next=toMove;

        }

        head = Dummy.next;

    }

    public void swapPairs() {
        Node Dummy=new Node(0);
        Node prev=Dummy;
        Dummy.next = head;
        Node first=prev.next;


        while(first!=null && first.next!=null){
            Node second=first.next;
            prev.next=second;
            first.next=second.next;
            second.next=first;
            prev=first;
            first=first.next;
        }
        head=Dummy.next;

    }


}