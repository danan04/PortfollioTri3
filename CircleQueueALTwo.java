import java.util.*;
import java.util.ArrayList;

/**
 *  Implementation of Queue, using ArrayList (previous and next).
 *
 * @author     John Mortensen
 * @created    December 24, 2019
 */
public class CircleQueueALTwo
{
    private ArrayList<Object> dataList = new ArrayList<Object>();
    private int headNode;            // 1st element in Queue
    private int tailNode;            // Last element in Queue
    private int currentNode;     

    /**
     *  Constructor for the SinglyLinkedList object
     *  Generates an empty list.
     */
    public CircleQueueALTwo()
    {
        headNode = -1;
        tailNode = -1;
        currentNode = -1;
    }

    /**
     *  Returns the head opaqueObject.
     *
     * @return  the head opaqueObject in Stack.
     */
    public Object getFirstObject()
    {
        currentNode = headNode;

        if (headNode == -1)
            return null;
        else
            return dataList.get(headNode);
    }

    /**
     *  Returns the tail opaqueObjects.
     *
     * @return  the current opaqueObject in Stack.
     */
    public Object getLastObject()
    {
        currentNode = tailNode;

        if (tailNode == -1)
            return null;
        else
            return dataList.get(tailNode);
    }

    /**
     *  Returns the current Object
     *
     * @return  the current Object in Stack.
     */
    public Object getObject()
    {
        if (currentNode == -1)
            return null;
        else
            return dataList.get(currentNode);
    }

    /**
     *  Advances the current node.
     *
     */
    public void setNext()
    {
        currentNode = currentNode++;

        // never let currentNode be null, wrap to head
        currentNode = currentNode % dataList.size();

    }

    /**
     *  Reverses the current node.
     *
     */
    public void setPrevious()
    {

        currentNode--;

        // never let currentNode be null, wrap to head
        if (currentNode < 0)
            currentNode += dataList.size();

    }

    /**
     *  Add a new object at the end of the Queue,
     *
     * @param  opaqueObject  is the data to be inserted in the Queue object.
     */
    public void add(Object opaqueObject)
    {
        // add new object to end of Queue
        // set opaqueObject
        // build previous link of tail (as current)
        dataList.add(opaqueObject);

        tailNode = dataList.size() - 1;
        currentNode = tailNode;

        if (headNode == -1)
            headNode = tailNode;

    }

    /**
     *  Delete an object from the front of the Queue,
     *
     */
    public Object delete()
    {
        Object opaqueObject = null;

        if (headNode != -1) {
            opaqueObject = dataList.get(headNode);
            dataList.remove(headNode);

            if (dataList.size() > 0)
                headNode = 0;
            else
                headNode = -1;

            if (headNode == -1)
                tailNode = headNode;

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

        int node = headNode;             // start from the head
        while (node < dataList.size() && node >= 0)
        {
            queueToString += "(" + dataList.get(node) + ")";  // append the data to output string
            node++;              // go to next node
            if ( node != dataList.size() )
                queueToString += ", ";
        }                                       // loop 'till queue ends
        queueToString += "]";
        return queueToString;
    }

    /**
     * Performs insertion sort based off of the contents of object
     */
    public void insertionSort() {   

        // iterate list, one less than length
        for (int i = 0; i < dataList.size() - 1; i++) {

            // insertion sort key logic
            int k = i + 1;
            Object swap = dataList.get(k);            
            while( k > 0 && swap.toString().compareTo(dataList.get(k-1).toString()) < 0) {
                dataList.set(k, dataList.get(k-1));
               
                k--;
            }
            dataList.set(k, swap);

        }

    }

    /**
     * Performs selection sort based off of the contents of object
     */
    public void selectionSort() {   

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
            String keyText = dataList.get(node1).toString();
            int key = node1;

            //walks slots forward until the  smallest element in the tail end is found
            while ( slot2 != -1) {
                // Check to see if key is less than current slot2.  If it is, set key to slot2
                if (dataList.get(slot2).toString().compareTo(keyText) < 0)
                {
                    //key.setObject(slot2.getObject());
                    keyText = dataList.get(slot2).toString();
                    key = slot2;
                }
                //slot2.setObject(slot1.getObject());

                //moves inner loop pointers
                slot2 = slot2 + 1;
                
                if (slot2 >= dataList.size())
                    slot2 = -1;

            }

            // Swap key with slot1
            if (dataList.get(slot1).toString().compareTo(keyText) != 0)
            {
                // swap the key with node1
                Object temp = dataList.get(key);
                //LinkedList temp = new LinkedList(key);
                dataList.set(key, dataList.get(slot1));
                dataList.set(slot1, temp);
            }

            //advance selection sort indexes
            node1 = node1 + 1;
            node2 = node1 + 1;
            
            if (node2 == dataList.size())
            {
                node2 = -1;
                node1 = -1;
            }
        } 

    }
}