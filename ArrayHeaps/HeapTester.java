public class HeapTester{
  public static void main(String[] args){
    ArrayHeap zeroBasedHeap = new ArrayHeap(20);
    for (int i=0; i<20;i++){
      zeroBasedHeap.setValueAtPosition(i,i);
    }
    System.out.println("Here we will play with min heaps! The starting state is as follows:");
    zeroBasedHeap.printHeap();
    System.out.println("let's remove shit!");
    zeroBasedHeap.addToHeap(2);
    zeroBasedHeap.removeHighestPriority();

    zeroBasedHeap.addToHeap(5);
    zeroBasedHeap.addToHeap(7);
    zeroBasedHeap.addToHeap(11);
    zeroBasedHeap.addToHeap(2);
    zeroBasedHeap.removeHighestPriority();
    zeroBasedHeap.removeHighestPriority();
    zeroBasedHeap.removeHighestPriority();
    zeroBasedHeap.removeHighestPriority();
    zeroBasedHeap.removeHighestPriority();
    //zeroBasedHeap.heapVisualizer(0,0);
  }
}
