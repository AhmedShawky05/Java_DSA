import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args) {
   DoublyLinkedList mylinkedlist=new DoublyLinkedList(1);
    mylinkedlist.append(2);
    mylinkedlist.append(3);
   System.out.println(mylinkedlist.removeLast().value);
    mylinkedlist.display();







  }
}
