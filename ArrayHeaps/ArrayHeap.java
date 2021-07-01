public class ArrayHeap{
  int[] arrayForHeap;
  int min;
  //Constructing heap
  public ArrayHeap(int sizeOfArray){
    arrayForHeap= new int[sizeOfArray];
  }
  public void printHeap(){
    System.out.print("[");
    for (int i=0;i<arrayForHeap.length;i++){
      System.out.print(arrayForHeap[i]);
      System.out.print(",");
    }
    System.out.print("]");
    System.out.println("");
  }
  public void setValueAtPosition(int position,int value){
    arrayForHeap[position]=value;

  }

  public int getMinMoveToRoot(){
    int min= arrayForHeap[0];
    int positionOfMin = 0;
    for(int i=0; i<arrayForHeap.length;i++){
      if (arrayForHeap[i]<min){
        min = arrayForHeap[i];
        positionOfMin=i;
      }
    }
    int tmpValue = arrayForHeap[0];
    arrayForHeap[0]=min;
    arrayForHeap[positionOfMin]=0;
    return min;
  }

  //moving shit within heap
  public int getParentPosition(int currentPosition){
    return Math.floorDiv(currentPosition-1, 2);
  }
  public int getLeftChildPosition(int currentPosition){
    return (2*currentPosition)+1;
  }
  public int getRightChildPosition(int currentPosition){
    return (2*currentPosition)+2;
  }



  private void removeHighestPriorityHelper(int currPosition){
    if (getRightChildPosition(currPosition)<arrayForHeap.length&&getLeftChildPosition(currPosition)<arrayForHeap.length){
      int leftChild = arrayForHeap[getLeftChildPosition(currPosition)];
      int rightChild = arrayForHeap[getRightChildPosition(currPosition)];
      int positionToSwap;
      if (rightChild<leftChild){
        positionToSwap = getRightChildPosition(currPosition);
      }else{
        positionToSwap=getLeftChildPosition(currPosition);
      }
      if (arrayForHeap[currPosition]<arrayForHeap[positionToSwap]){
      System.out.println("Heap Updated");
    }else{
      int currentValue= arrayForHeap[currPosition];
      int childValue = arrayForHeap[positionToSwap];
      arrayForHeap[currPosition]=childValue;
      arrayForHeap[positionToSwap]=currentValue;
      removeHighestPriorityHelper(positionToSwap);
    }

  }else{
    System.out.println("Heap Updated");

  }






  }

  public int removeHighestPriority(){
    int valToReturn =arrayForHeap[0];
    int tmpValue= arrayForHeap[arrayForHeap.length-1];
    arrayForHeap[0]=tmpValue;
    arrayForHeap[arrayForHeap.length-1]=valToReturn;
    shrinkArray();
    removeHighestPriorityHelper(0);
    heapVisualizer(0,0);
    return valToReturn;

  }

  private void addToHeapHelper(int currPosition){
    int parentPosition= getParentPosition(currPosition);

    if(arrayForHeap[parentPosition] <= arrayForHeap[currPosition]){
      System.out.println("Heap Updated");
    }else{

      int parentValue= arrayForHeap[parentPosition];
      int currentValue = arrayForHeap[currPosition];
      arrayForHeap[parentPosition]=currentValue;
      arrayForHeap[currPosition]=parentValue;
      addToHeapHelper(parentPosition);
    }


  }


  public void addToHeap(int numToAdd){
    growArray();
    arrayForHeap[arrayForHeap.length-1]=numToAdd;
    int startingPosition = arrayForHeap.length-1;
    addToHeapHelper(startingPosition);
    heapVisualizer(0,0);



  }
  public void shrinkArray(){
    int[] tmparray= new int[arrayForHeap.length-1];
    for(int i=0; i<arrayForHeap.length-1;i++){
      tmparray[i]=arrayForHeap[i];

    }
    arrayForHeap=tmparray;
  }
  public void growArray(){
    int[] tmpArray = new int[arrayForHeap.length+1];
    for(int i =0; i<arrayForHeap.length;i++){
      tmpArray[i] = arrayForHeap[i];
    }
    arrayForHeap=tmpArray;
  }

  public void heapVisualizer(int counter, int position){
    int spaces=Math.floorDiv(arrayForHeap.length,2);
    int placement =0;
    if (position>=arrayForHeap.length){
    System.out.println("");

  }else{
    System.out.print("_".repeat(spaces-counter-1));
    while (placement<Math.pow(2,counter)&&position+placement<arrayForHeap.length){
      if (placement%2==0){
          System.out.print("|");

      }else{
        System.out.print("_");
      }

      System.out.print(arrayForHeap[placement+position]);



      placement+=1;
    }
    System.out.print("|");
    System.out.print("_".repeat(spaces-counter));
    position += placement;
    System.out.println("");

    heapVisualizer(counter+1, position);
  }

  }



  }
