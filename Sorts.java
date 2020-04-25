import java.util.Date;
import java.util.Calendar;

/**
 * Write a description of class isort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sorts
{
    enum ListType {Standard, Bubble, Insert, Selection};
    ListType listType = ListType.Standard;

    private int[] list;
    private int[] blist; int bcompares = 0; int bswaps = 0; long btime = 0;
    private int[] ilist; int icompares = 0; int iswaps = 0; long itime = 0;
    private int[] slist; int scompares = 0; int sswaps = 0; long stime = 0;
    
    boolean showList = true;

    /**
     * Constructor for objects of class isort
     */
    public Sorts()
    {
        int size = 10;
        list = new int[size];
        for (int i = 0; i < list.length; i++)
            list[i] = (int)(Math.random() * size) + 1;

        blist = list.clone();
        this.BubbleSort();
        ilist = list.clone();
        this.InsertionSort();
        slist = list.clone();
        this.SelectionSort();
    }

    public String toString() {
        int[] list;

        switch(listType) {
            case Standard:
            System.out.println("Original List");
            list = this.list;
            break;
            case Bubble:
            System.out.println("Bubble Sort -- "
                + " Operations: " + (this.bcompares + this.bswaps)
                + " Compares: " + this.bcompares
                + " Swaps: " + this.bswaps
                + " Time (ms) " + (double)(btime));
            list = this.blist;
            break;
            case Insert:
            System.out.println("Insertions Sort -- "
                + " Operations: " + (this.icompares + this.iswaps)
                + " Compares: " + this.icompares
                + " Swaps: " + this.iswaps
                + " Time (ms) " + (double)(itime));
            list = this.ilist;
            break;
            default:
            System.out.println("Selection Sort -- "
                + " Operations: " + (this.scompares + this.sswaps)
                + " Compares: " + this.scompares
                + " Swaps: " + this.sswaps
                + " Time (ms) " + (double)(stime));
            list = this.slist;
        }

        String output;
        
        if (showList)
        {
            output = "[";
            for (int i = 0; i < list.length; i++)
                output += " " + list[i];
        }
        else
        {
            output = "";
        }
        return output +" ]";    
    }

    private int[] BubbleSort() { 

        Date dateOne = new Date();
        long start_time, end_time;
        // Get the start time
        start_time = dateOne.getTime();
        
        // iterate list, one less than length
        for (int i = 0; i < blist.length - 1; i++) {

            // bubble sort key logic
            for (int k = 1; k < blist.length - i; k++) {

                // analytics
                this.bcompares++; // compare counter

                // bubble sort swap logic
                if (blist[k-1] > blist[k]) {
                    int swap = blist[k];
                    blist[k] = blist[k-1];
                    blist[k-1] = swap;

                    // analytics
                    this.bswaps++; // swap counter
                }

            }

        }
        
        Date dateOne1 = new Date(); //c1.getTime();
        end_time = dateOne1.getTime();
        // Get the end time
        this.btime = end_time - start_time;
        
        return blist;
    }

    private int[] InsertionSort() {
        
        Date dateOne = new Date();
        long start_time, end_time;
        // Get the start time
        start_time = dateOne.getTime();
        
        // iterate list, one less than length
        for (int i = 0; i < ilist.length - 1; i++) {

            // insertion sort key logic
            int k = i + 1;
            int swap = ilist[k];            
            while( k > 0 && swap < ilist[k-1]) {
                ilist[k] = ilist[k-1];
                k--;

                // analytics
                this.icompares++; // compare counter
                this.iswaps++; // shift counter
            }
            ilist[k] = swap;

            this.iswaps++;  // increment swap counter

        }

        Date dateOne1 = new Date();
        end_time = dateOne1.getTime();
        // Get the end time
        this.itime = end_time - start_time;
        
        return ilist;
    }

    /*
     * Add Selection Sort
     * Selection sort: repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning.
     */
    public int[] SelectionSort()
    {
        Date dateOne = new Date();
        long start_time, end_time;
        // Get the start time
        start_time = dateOne.getTime();
        
        for (int i = 0; i < slist.length - 1; i++)
        {
            //find smallest number
            int min_i = i; 
            for (int j = i+1; j < slist.length; j++)
            {
                if (slist[j] < slist[min_i]) 
                    min_i = j; 

                //analytics
                this.scompares++;	//compare countersssssss
            }
            //swap smallest number with the first number
            int temp = slist[min_i]; 
            slist[min_i] = slist[i]; 
            slist[i] = temp; 

            //analytics
            this.sswaps++;	//swap counter
        }

        Date dateOne1 = new Date();
        end_time = dateOne1.getTime();
        // Get the end time
        this.stime = end_time - start_time;
        
        return slist;
    }

    /**
     *
     */
    public static void main(String[] args)
    {
        // Original List
        Sorts is = new Sorts();
        System.out.println(is);

        // Bubble Sort
        is.listType = ListType.Bubble;
        System.out.println(is);

        // Insertion Sort
        is.listType = ListType.Insert;
        System.out.println(is);

        // Selection Sort
        is.listType = ListType.Selection;
        System.out.println(is);
    }
    
    /**
     * Analysis:
     * Bubble sort is the easiest form of sorting  but is also the most inefficient. Bubble sort had both the most compares and the most swaps. 
     * Although the selection sort had less swaps than insertion sort, it had more compares, which would be less efficient. 
     * In a selection sort: 
     * you have to scan the entire unsorted part of the list to find the minimum remaining element for every element you need to add
     * In an insertion sort:
     * you search the sorted section to find out where the next element goes but the search ends once you have found the insertion point
     */
}