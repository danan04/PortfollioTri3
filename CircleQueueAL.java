
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
   
   private Initial firstObject;			// 1st element in Queue
   private Initial finalObject;			// Last element in Queue
   private Initial currentObject;		
   private ArrayList<Initial> list = new ArrayList<Initial>();
  /**
   *  Constructor for the SinglyLinkedList object
   *  Generates an empty list.
   */
  public CircleQueueAL()
  {
    firstObject = null;
    finalObject = null;
    currentObject = null;
  }
  
  /**
   *  Returns the head opaqueObject.
   *
   * @return  the head opaqueObject in Stack.
   */
  public Object getFirstObject()
  {
  	currentObject = firstObject;

    if (firstObject == null)
    	return null;
    else
    	return list.get(0);
  }

  /**
   *  Returns the tail opaqueObjects.
   *
   * @return  the current opaqueObject in Stack.
   */
  public Object getLastObject()
  {
	currentObject = finalObject;

    if (finalObject == null)
    	return null;
    else
    	return list.get(list.size()-1);
  }
  
  /**
   *  Returns the current Object
   *
   * @return  the current Object in Stack.
   */
  public Object getObject()
  {
    if (currentObject == null)
  	  return null;
    else
      return list.indexOf(currentObject);
  }
  
  /**
   *  Advances the current node.
   *
   */
  public void setNext()
  {
	int newIndex= list.indexOf(currentObject);
	  currentObject = list.get(newIndex +1);
	
	// never let currentNode be null, wrap to head
	if (currentObject == null)
		currentObject = firstObject;
  }
  
  /**
   *  Reverses the current node.
   *
   */
  public void setPrevious()
  {
	  int newIndex = list.indexOf(currentObject);
	  currentObject = list.get(newIndex -1);
	// never let currentNode be null, wrap to head
	if (currentObject == null)
		currentObject = finalObject;
  }
  
  
  /**
   *  Add a new object at the end of the Queue,
   *
   * @param  opaqueObject  is the data to be inserted in the Queue object.
   */
  public void add(Initial o)
  {
	  // add new object to end of Queue
	  // set opaqueObject
	  // build previous link of tail (as current)
	  list.add(o);
	  finalObject = list.get(list.size() -1);
	  
	  // build next link of current (as tail)
	  if (currentObject != null)
	  { int newIndex = list.indexOf(currentObject);
	  list.set(newIndex +1,  finalObject);
	  }
	  
	  // after links are established current eq tail
	  currentObject = finalObject;

	  // head eq tail on 1st element only
	  if (firstObject == null) {
		  firstObject = finalObject;
	  }
  }
  
  /**
   *  Delete an object from the front of the Queue,
   *
   */
  public Object delete()
  {
	  Initial opaqueObject = null;
	  	  
	  if (firstObject != null) {
		  opaqueObject = list.get(0);
		  firstObject = list.get(1);
		  if (firstObject == null)
			  finalObject = firstObject;
		  else
			  list.set(list.indexOf(finalObject),null);
	  }
	  		
	  return opaqueObject;
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

    Initial object = firstObject;  			// start from the head
    while (object != null)
    {
    	queueToString += "(" + object + ")"; 	// append the data to output string
    	/*
    	 * Alternative if that doesnt work
    	 * queueToString += "(" + object.toString + ")";
    	 */
    	if (object != null)
    		queueToString += ", ";
    }										// loop 'till queue ends
    queueToString += "]";
    return queueToString;
  }

  /**
   * Performs insertion sort based off of the contents of object
   */

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
  
}

