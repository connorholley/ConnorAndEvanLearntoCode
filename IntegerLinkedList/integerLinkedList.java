public class integerLinkedList{
  Node head;
  Node tail;
  int count;
  public integerLinkedList(){
    this.head = null;
    this.tail = null;
    count=0;
  }
  public integerLinkedList(Node headNode){
    this.head = headNode;
    this.tail = headNode;
    count=1;
  }

  public  int getSize(){
    return count;
  }

  public  Node getHead(){

    return this.head;
  }

  public  Node getTail(){
    return this.tail;
  }

  public  void insertFront(Node newNode){
    if (head!=null){
      head.setPrev(newNode);
      newNode.setNext(head);
      head = newNode;
      this.count+=1;

    }else{
      head = newNode;
    }



  }
  public  void insertBack(Node newNode){
    newNode.setPrev(tail);
    newNode.setNext(null);
    tail.setNext(newNode);
    tail = newNode;
    this.count+=1;

  }

  public  void insertMiddle(Node tmphead, Node newNode, int position,int counter){
    if (counter==position){
      newNode.setPrev(tmphead);
      newNode.setNext(tmphead.getNext());
      tmphead.getNext().setPrev(newNode);
      tmphead.setNext(newNode);
      this.count+=1;
    }else{
      insertMiddle(tmphead.getNext(),newNode,position,counter+1);
    }

  }

  public  void removeFront(){
    if (head!=null){
      head = head.getNext();
      head.setPrev(null);
      this.count-=1;

    }

  }

  public  void removeBack(){
    if (tail!=null){
      tail = tail.getPrev();
      tail.setNext(null);
      this.count-=1;

    }

  }

  public  void removeAtPosition(Node tmphead, int position,int counter){
    if (counter==position){
      if (position==0){
        removeFront();
      }else if(position == this.count){
        removeBack();
      }else{
        tmphead.getPrev().setNext(tmphead.getNext());
        tmphead.getNext().setPrev(tmphead.getPrev());

        this.count-=1;
      }
    }else{
      removeAtPosition(tmphead.getNext(),position,counter+1);
    }

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
