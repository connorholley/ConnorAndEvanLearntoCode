public class linkedListStack{
  Node top;
  integerLinkedList linkedList;
  public linkedListStack(integerLinkedList newlinkedList){
    linkedList = newlinkedList;
    top = linkedList.getHead();

  }
  public int peek(){
    return top.getData();
  }

  public Node getTop(){
    return top;
  }

  public void push(Node newNode){
    linkedList.insertFront(newNode);
    top = newNode;
  }
  public int pop(){

      int toReturn = top.getData();
      linkedList.removeFront();
      top= linkedList.getHead();
      return toReturn;

    }



  public void popAll(){
    while(top!=null){
      try{
        System.out.println(pop());

      }catch( Exception e){
        ;
      }

  }

}

  public  void toString(Node tmphead){
    if (tmphead==null){
      System.out.println("LinkedList/Stack is empty");
    }else if (tmphead.getNext()==null){
    System.out.println(tmphead.getData());
    System.out.println("head->tail");

  }else{
    System.out.print(tmphead.getData());
    System.out.print("->");
    toString(tmphead.getNext());
  }
}
}
