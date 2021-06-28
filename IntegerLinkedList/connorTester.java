public class connorTester{

  public static void main (String[] args){

    //Creating test list
    Node headNode = new Node(69);
    integerLinkedList listy = new integerLinkedList(headNode);
    for (int i =0; i<10; i++){
      Node newNode = new Node(i);
      listy.insertFront(newNode);
    }

    //Testing some functionality
    //toString methods
    System.out.println("Testing toString and toStringReverse");
    listy.toString(listy.getHead());
    listy.toStringReverse(listy.getTail());
    System.out.println("--------------------");

    //removeAtPosition method
    System.out.println("Testing removeAtPosition");
    listy.toString(listy.getHead());
    listy.toStringReverse(listy.getTail());
    System.out.println("The size is: "+listy.getSize());
    System.out.println("");
    listy.removeAtPosition(listy.getHead(), 1,0);
    listy.toString(listy.getHead());
    listy.toStringReverse(listy.getTail());
    System.out.println("The size is: "+listy.getSize());
    System.out.println("--------------------");
    //removeBack
    System.out.println("Testing removeBack");
    listy.toStringReverse(listy.getTail());
    listy.toString(listy.getHead());
    System.out.println("The size is: "+listy.getSize());
    System.out.println("");
    listy.removeBack();
    listy.toStringReverse(listy.getTail());
    listy.toString(listy.getHead());
    System.out.println("The size is: "+listy.getSize());
    System.out.println("--------------------");
    //removeFront
    System.out.println("Testing removeFront");
    listy.toStringReverse(listy.getTail());
    listy.toString(listy.getHead());
    System.out.println("The size is: "+listy.getSize());
    System.out.println("");
    listy.removeFront();
    listy.toStringReverse(listy.getTail());
    listy.toString(listy.getHead());
    System.out.println("The size is: "+listy.getSize());
    System.out.println("--------------------");
  }



}
