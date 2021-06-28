public class Node{
  int data;
  Node next;
  Node prev;
  public Node(int nodeData){
    this.data = nodeData;
    this.next = null;
    this.prev = null;
  }
  public Node(int nodeData, Node nextNode, Node prevNode){
    this.data = nodeData;
    this.next = nextNode;
    this.prev = prevNode;
  }
  public  int getData(){
    return this.data;
  }
  public  Node getNext(){
    return this.next;
  }
  public Node getPrev(){
    return this.prev;
  }
  public  void setData(int nodeData){
    this.data= nodeData;
  }
  public  void setNext(Node nextNode){
    this.next = nextNode;
  }
  public  void setPrev(Node prevNode){
    this.prev = prevNode;
  }






}
