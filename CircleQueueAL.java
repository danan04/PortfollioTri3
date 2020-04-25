
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
    list.clear();
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


/*public void insertionSort() {	


  public void insertionSort() {	

	
	//two nodes needed for insertion sort indexes
    LinkedList node1 = headNode;
    LinkedList node2 = (node1 == null) ? null : node1.getNext();
    
    //continue while nodes remain in bounds
    while (node2 != null) {	
    	
    	//inner loop pointers for compares and shifts
    	LinkedList slot1 = node1;
    	LinkedList slot2 = node2;
    		
		//key to be inserted into sorted slot
		LinkedList key = new LinkedList(node2);		//note: make key a different object, persistent/static in value (node2 moves)
		String keyText = node2.getObject().toString();

		//walks slots backwards until key position in found
		while ( slot1.getObject().toString().compareTo(keyText) > 0 ) {
	    	//shifts object greater than key value to the right in list
    		slot2.setObject(slot1.getObject());

			//moves inner loop pointers
			slot1 = slot1.getPrevious();
			slot2 = slot2.getPrevious();
			
			//stop at the front of list
			if (slot1 == null)
				break;
			
    	}
		//place key in insertion position
    	slot2.setObject(key.getObject());

    	//advance insertion sort indexes
    	node1 = node1.getNext();
    	node2 = node2.getNext();
    } 
    
  }
  */
}

