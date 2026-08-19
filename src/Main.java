public class Main {
  public static void main(String[] args) {
    LinkedList mylinkedlist=new LinkedList(4);
    mylinkedlist.append(6);
    mylinkedlist.prepend(2);

    mylinkedlist.set(1,3);
    mylinkedlist.set(2,5);
    mylinkedlist.insert(2,4);
    System.out.println(mylinkedlist.remove(1).value);
    mylinkedlist.display();







  }
}
