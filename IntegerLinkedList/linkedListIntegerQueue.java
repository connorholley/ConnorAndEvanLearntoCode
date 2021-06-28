public class linkedListIntegerQueue{
  Node front;
  Node back;
  integerLinkedList listy;

  public linkedListIntegerQueue(integerLinkedList listToBegin){
    front = listToBegin.getHead();
    back = listToBegin.getTail();
    listy = listToBegin;

  }
  public void enqueue(Node toAdd){
    listy.insertBack(toAdd);

  }
  public int dequeue(){
    int toReturn = front.getData();
    listy.removeFront();
    front= listy.getHead();
    return toReturn;

  }
  public Node getFront(){
    return this.front;
  }
  public  void toString(Node tmphead){

    if (tmphead.getNext()==null){
      System.out.println(tmphead.getData());
      System.out.println("head->tail");

    }else{
      System.out.print(tmphead.getData());
      System.out.print("->");
      toString(tmphead.getNext());

    }
  }
  public int sizeOfQueue(){
    return listy.getSize();
  }
  public  void toStringReverse(Node tmptail){

    if (tmptail.getPrev()==null){
      System.out.println(tmptail.getData());
      System.out.println("tail->head");

    }else{
      System.out.print(tmptail.getData());
      System.out.print("->");
      toStringReverse(tmptail.getPrev());

    }
  }


}
