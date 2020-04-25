
/**
 * 
 * @author
 *
 *	Rewrite CircleQueue using arraylists
 */

import java.util.*;
import java.util.ArrayList;

public class CircleQueueAL<Initial>
{
   private int currentIndex;			// 1st element in Queue		
   private ArrayList<Initial> list;
  /**
   *  Constructor for the SinglyLinkedList object
   *  Generates an empty list.
   */
  public CircleQueueAL()
  {
    ArrayList<Initial> list = new ArrayList();
    currentIndex = 0;
  }
  
  /**
   *  Returns the head opaqueObject.
   *
   * @return  the head opaqueObject in Stack.
   */
  public Object getFirstObject()
  {
  	currentIndex = 0;

    	return list.get(currentIndex);
  }

  /**
   *  Returns the tail opaqueObjects.
   *
   * @return  the current opaqueObject in Stack.
   */
  public Object getLastObject()
  {

    	return list.get(list.size()-1);
  }
  
  /**
   *  Returns the current Object
   *
   * @return  the current Object in Stack.
   */
  public Object getObject()
  {
      return list.indexOf(currentIndex);
  }
  
  /**
   *  Advances the current node.
   *
   */
  public void setNext()
  {
	int newIndex = list.size() - 1;
	 if (currentIndex != newIndex) {
	currentIndex++;
	 }
	// never let currentNode be null, wrap to head

  }
  
  /**
   *  Reverses the current node.
   *
   */
  public void setPrevious()
  {
	  if (currentIndex != 0)
	  {
		  currentIndex--;
	  }
	// never let currentNode be null, wrap to head

  }
  
  
  /**
   *  Add a new object at the end of the Queue,
   *
   * @param  opaqueObject  is the data to be inserted in the Queue object.
   */
  public void add(Initial object)
  {
	  // add new object to end of Queue
	 currentIndex = list.size();
      list.add(object);
      
  }
  
  /**
   *  Delete an object from the front of the Queue,
   *
   */
  public Object delete()
  {
	  Initial deletedObject = null;
	  	  
	  if (list.size() != 0) {
		  deletedObject = list.get(0);
		  list.remove(0);

	  }
	  		
	  return deletedObject;
  }
  
  
  /**
   *  Returns a string representation of this Queue,
   *  polymorphic nature of toString overrides of standard System.out.print behavior
   *
   * @return    string representation of this Queue
   */

  public String toString()
  {
    String queueToString = "[";

    Initial object = list.get(0);  			// start from the head
   
    while (object != null)
    {
    	queueToString += "(" + object + ")"; 	// append the data to output string
    	/*
    	 * Alternative if that doesnt work
    	 * queueToString += "(" + object.toString + ")";
    	 */
    	if (object != null)
    		queueToString += ", ";
    }
// loop 'till queue ends
    queueToString += "]";
    return queueToString;
  } 

  /**
   * Performs insertion sort based off of the contents of object

   */



  public void insertionSort() {   

      // iterate list, one less than length
      for (int i = 0; i < list.size() - 1; i++) {

          // insertion sort key logic
          int k = i + 1;
          Initial swap = list.get(k);            
          while( k > 0 && swap.toString().compareTo(list.get(k-1).toString()) < 0) {
              list.set(k, list.get(k-1));
             
              k--;
          }
          list.set(k, swap);

      }

  }

  /**
   * Performs selection sort based off of the contents of object
   */
  /*public void selectionSort() {   

      //two nodes needed for selection sort indexes
      int node1 = headNode;
      int node2 = (node1 == -1) ? -1 : (node1+1);

      //continue while nodes remain in bounds
      while (node2 != -1) { 

          //inner loop pointers for compares and shifts
          int slot1 = node1;
          int slot2 = node2;

          //key to be swapped with smallest node in the tail
          //LinkedList key = new LinkedList(node1);       //note: make key a different object, persistent/static in value (node2 moves)
          String keyText = list.get(node1).toString();
          int key = node1;

          //walks slots forward until the  smallest element in the tail end is found
          while ( slot2 != -1) {
              // Check to see if key is less than current slot2.  If it is, set key to slot2
              if (list.get(slot2).toString().compareTo(keyText) < 0)
              {
                  //key.setObject(slot2.getObject());
                  keyText = list.get(slot2).toString();
                  key = slot2;
              }
              //slot2.setObject(slot1.getObject());

              //moves inner loop pointers
              slot2 = slot2 + 1;
              
              if (slot2 >= list.size())
                  slot2 = -1;

          }

          // Swap key with slot1
          if (list.get(slot1).toString().compareTo(keyText) != 0)
          {
              // swap the key with node1
              Initial temp = list.get(key);
              //LinkedList temp = new LinkedList(key);
              list.set(key, list.get(slot1));
              list.set(slot1, temp);
          }

          //advance selection sort indexes
          node1 = node1 + 1;
          node2 = node1 + 1;
          
          if (node2 == list.size())
          {
              node2 = -1;
              node1 = -1;
          }
      } 

  }*/
}