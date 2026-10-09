import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args) {
   DoublyLinkedList mylinkedlist=new DoublyLinkedList(2);
    mylinkedlist.append(3);
    mylinkedlist.append(4);
    mylinkedlist.prepend(1);
    System.out.println(mylinkedlist.get(1).value);

    mylinkedlist.display();







  }
}
