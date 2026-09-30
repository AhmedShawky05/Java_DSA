public class Main {
  public static void main(String[] args) {
    LinkedList mylinkedlist=new LinkedList(4);
    mylinkedlist.append(6);
    mylinkedlist.prepend(2);


    System.out.println(mylinkedlist.hasLoop());

    mylinkedlist.display();







  }
}
