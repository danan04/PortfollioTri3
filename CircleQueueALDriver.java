import java.util.ArrayList;

public class CircleQueueALDriver<Initial> {
	private CircleQueueAL cqueue;	// circle queue object
	private int count; // number of objects in circle queue

	/* 
	 * Circle queue constructor
	 */
	public CircleQueueALDriver()
	{
		count = 0;		
		cqueue = new CircleQueueAL();
	}

	/*
	 * Add any array of objects to the queue
	 */
	public void addCQueue(ArrayList<Initial> newlist)
	{
		ConsoleMethods.println("Add " + newlist.size());
		for (Initial o : newlist)
		{
			cqueue.add(o);
			ConsoleMethods.println("Add: " + cqueue.getObject() + " " + cqueue);
			this.count++;
		}
		ConsoleMethods.println();			
	}
	
	/* 
	 * Show key objects/properties of circle queue
	 */
	public void showCQueue()
	{
		ConsoleMethods.println("Size: " + count);
		ConsoleMethods.println("First Element: " + cqueue.getFirstObject());
		ConsoleMethods.println("Last Element: " + cqueue.getLastObject());
		ConsoleMethods.println("Full cqueue: " + cqueue);
		ConsoleMethods.println();
	}
	
	/* 
	 * Delete/Clear all object in circle queue
	 */
	public void deleteCQueue()
	{
		int length = this.count;
		ConsoleMethods.println("Delete " + length);
		
		for (int i = 0; i<length; i++)
		{
			ConsoleMethods.println("Delete: " + cqueue.delete() + " " + cqueue);
			this.count--;
		}
	}
	
	
	/* 
	 * Illustrate different Objects that can be placed on same Queue
	 */
	public static void main(String[] args)
	
	{			
		//queue
		CircleQueueALDriver trial = new CircleQueueALDriver();
		
		//add different types of objects to the same opaque queue
		trial.addCQueue(Criminal.criminalData2());		
		//display queue objects in queue order
		trial.showCQueue();
		
		//sort queue objects by specific element within the object and display in sort order
		Criminal.key = Criminal.KeyType.name;
		trial.cqueue.insertionSort();
		trial.showCQueue();
		
		//display queue objects
		Criminal.key = Criminal.KeyType.combo;
		Cupcakes.key = Cupcakes.KeyType.combo;
		Alphabet.key = Alphabet.KeyType.combo;
		trial.showCQueue();
		
		//delete queue objects
		trial.deleteCQueue();
	}
	
}
