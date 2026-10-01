import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args) {
    LinkedList mylinkedlist=new LinkedList(3);
    mylinkedlist.append(8);
    mylinkedlist.append(5);
    mylinkedlist.append(10);
    mylinkedlist.append(2);
    mylinkedlist.append(1);

mylinkedlist.partitionList(5);

    mylinkedlist.display();







  }
}
