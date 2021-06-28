public class connorTester{

  public static void main (String[] args){

    //Creating test list
    Node linkedListBeginning= new Node(123);
    integerLinkedList listy = new integerLinkedList(linkedListBeginning);


    for (int i =0; i<10; i++){
      Node newNode = new Node(i);
      listy.insertFront(newNode);

    }

    //Creating test Stack
    Node beginningofStack= new Node(123);
    integerLinkedList linkedListForStack = new integerLinkedList(beginningofStack);
    for (int i =10; i<20; i++){
      Node nodeForStack = new Node(i);
      linkedListForStack.insertFront(nodeForStack);

    }

    linkedListStack connorStack = new linkedListStack(linkedListForStack);


    //Creating test Queue
    Node firstInLine = new Node(101);
    integerLinkedList linkedListForQueue = new integerLinkedList(firstInLine);
    for (int i =10; i<20; i++){
      Node nodeForQueue = new Node(i);
      linkedListForQueue.insertFront(nodeForQueue);

    }

    linkedListIntegerQueue connorQueue = new linkedListIntegerQueue(linkedListForQueue);


    //Testing some Linked List functionality
    //toString methods
    System.out.println("");
    System.out.println("Testing LinkedList functionality");
    System.out.println("--------------------");
    System.out.println("--------------------");
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


    //Testing Stack functionality
    System.out.println("");
    System.out.println("Testing Stack functionality");
    System.out.println("--------------------");
    System.out.println("--------------------");
    //Test pop
    System.out.println("Testing pop");
    connorStack.toString(connorStack.getTop());
    System.out.println("popped off: "+connorStack.pop());
    connorStack.toString(connorStack.getTop());
    System.out.println("--------------------");
    //Test push
    System.out.println("Testing push");
    connorStack.toString(connorStack.getTop());
    Node nodeAbode = new Node(400);
    System.out.println("pushed on: "+nodeAbode.getData());
    connorStack.push(nodeAbode);
    connorStack.toString(connorStack.getTop());
    System.out.println("--------------------");

    //Test peak
    System.out.println("Testing peak");
    connorStack.toString(connorStack.getTop());

    System.out.println("When I peak I see: "+connorStack.peek());

    connorStack.toString(connorStack.getTop());
    System.out.println("--------------------");

    //variety of tests
    System.out.println("Testing pop, push,peak");

    connorStack.toString(connorStack.getTop());
    System.out.println("popped off: "+connorStack.pop());
    connorStack.toString(connorStack.getTop());

    connorStack.toString(connorStack.getTop());
    Node nodeChode = new Node(700);
    System.out.println("pushed on: "+nodeChode.getData());
    connorStack.push(nodeChode);
    connorStack.toString(connorStack.getTop());

    connorStack.toString(connorStack.getTop());
    System.out.println("When I peak I see: "+connorStack.peek());

    connorStack.toString(connorStack.getTop());
    System.out.println("--------------------");



    //Test popAll
    System.out.println("Testing popAll");
    connorStack.toString(connorStack.getTop());
    connorStack.popAll();
    connorStack.toString(connorStack.getTop());
    System.out.println("--------------------");
    System.out.println("--------------------");



    //Test Queue
    System.out.println("");
    System.out.println("Testing Queue functionality");
    System.out.println("--------------------");
    System.out.println("--------------------");

    //Test enqueue
    System.out.println("Testing enqueue");
    connorQueue.toString(connorQueue.getFront());
    System.out.println("The size is: "+connorQueue.sizeOfQueue());
    Node newPersonInLine = new Node(47);
    connorQueue.enqueue(newPersonInLine);
    System.out.println("The queue has enqueued the value of: "+ newPersonInLine.getData());
    System.out.println("The size is: "+connorQueue.sizeOfQueue());
    connorQueue.toString(connorQueue.getFront());

    System.out.println("--------------------");
    System.out.println("");

    System.out.println("Testing dequeue");
    connorQueue.toString(connorQueue.getFront());
    System.out.println("The size is: "+connorQueue.sizeOfQueue());
    System.out.println("The queue has dequeued: "+ connorQueue.dequeue());
    System.out.println("The size is: "+connorQueue.sizeOfQueue());
    connorQueue.toString(connorQueue.getFront());
    System.out.println("--------------------");
    System.out.println("--------------------");
  }



}
