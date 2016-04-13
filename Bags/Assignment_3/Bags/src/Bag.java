

public final class Bag<T> implements BagInterface<T>  {
    
    @SuppressWarnings("FieldMayBeFinal")
    private T[] bag_items;
    private int defaultBagSize = 3;
    private int numberOfEntries;
    private int growth = 5;        //when no space in bag, increase by 5
                                   //can be changed in this file
    
    public Bag() {
        bag_items = (T[])new Object[defaultBagSize]; // default 3 item bag
        this.numberOfEntries=0;
    }
    
    public Bag(int startSize)
    {
        bag_items = (T[])new Object[startSize];
        this.numberOfEntries=0;
    }
    
    // return the current size of the bag, or the number of elements in the bag
    @Override
    public int getSize(){
        return this.numberOfEntries;
    }
    
    // returns true if bag is empty or false if bag is not empty
    @Override
    public boolean isEmpty() {
        return this.numberOfEntries == 0;
    }
    
    // add item to bag, returns true if successful, false if not
    @Override
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public boolean add(T item) {
        if ( numberOfEntries >= bag_items.length ){                             // make temp array larger than original
            //System.out.println("Increasing size of bag...");
            T[] tmp = (T[])new Object[this.numberOfEntries+growth];             // create new temp array
            for(int i=0;i<bag_items.length;i++){                        
                tmp[i] = bag_items[i];                                          //copy to temp array
            }
            
            this.bag_items = (T[])new Object[this.numberOfEntries+growth];
            for(int i=0;i<bag_items.length;i++){                                 //re-declare bag as a bigger size
                bag_items[i] = tmp[i];                                           //copy items from temp array back to original
            }                                                                   //and newly re-sized array        
        }
        
        bag_items[numberOfEntries++] = item;
        return true;
    }
    
    // returns true if item is removed from bag
    @Override
    public boolean remove(T item) {
        for(int i=0;i<this.numberOfEntries;i++)
        {
            if ( this.bag_items[i]==item )
            {
                for(int j=i+1;j<this.numberOfEntries;j++)
                    this.bag_items[j-1]=this.bag_items[j];
                this.numberOfEntries--;
                return true;
            }
        }
        return false;
    }
    
    // clear the bag of all items
    @Override
    public void clear()
    {
        this.numberOfEntries=0; // just reset numberOfEntries to zero and overwrite old data when we add new data
    }
    
    // returns true if item found in bag
    @Override
    public boolean contains(T item) {
        for(int i=0;i<this.numberOfEntries;i++) if ( bag_items[i]==item ) return true;
        return false;
    }
    
    @Override       //warnings are annoying
    @SuppressWarnings("ManualArrayToCollectionCopy")
    
    public T[] toArray() {
        T[] arr = (T[])new Object[this.numberOfEntries];
        for(int i=0;i<this.numberOfEntries;i++) arr[i]=this.bag_items[i];
        return arr;
    }        
    public int getBagSize(){
        return this.defaultBagSize;
    }
    
    // if x is TRUE, sort from smallest to largest
    // Selection Sort
    public void selSort(boolean x) {        
        //this sorts the T_bag by converting values to strings,
        //then performing a compareTo() on the strings, which
        //subsequently returns an int value that can be used
        //if the values being compared are GT, LT, or EQ
        if (x == true){
            for(int i=0;i<this.numberOfEntries-1;i++){
                int min = i;
                for(int j=i+1;j<this.numberOfEntries;j++){
                    //converting to Integers in order to perform comparison by
                    //subtraction.
                    //using replace() in order to remove perion in decimal values,
                    //this doesnt cause inaccuracies, it can be compared to changing the base
                    //on a value and comparing it, we are only concerned with it being
                    //LT or GT, the original value os not changed.
                    Integer jay = Integer.valueOf(bag_items[j].toString().replace(".", ""));
                    Integer cur_min = Integer.valueOf(bag_items[min].toString().replace(".", ""));
                    //perform comparison by subtraction,
                    //negative values result in jay(current value) being new minimum
                    //if compareVal is greater than 0, then jay(current_value)
                    //is larger than min
                    int compareVal = jay-cur_min;
                    if(compareVal<= 0){
                        min = j;
                    }
                }
                
                //swap
                T smalls = bag_items[min];
                bag_items[min] = bag_items[i];
                bag_items[i] = smalls;
                //Integer minimum = arr[min];
                //arr[min] = arr[i];
                //arr[i] = minimum;
            }
        }
        //same as before, except minis now max and we are checking for larger numbers
        //instead of smaller ones
        else if(x != true){
            for(int i=0;i<this.numberOfEntries-1;i++){
                int max = i;
                for(int j=i+1;j<this.numberOfEntries;j++){
                    
                    Integer jay = Integer.valueOf(bag_items[j].toString().replace(".", ""));
                    Integer cur_max = Integer.valueOf(bag_items[max].toString().replace(".", ""));
          
                    int compareVal = jay-cur_max;
                    if(compareVal >= 0){
                        max = j;
                    }
                }
                //swap
                T smalls = bag_items[max];
                bag_items[max] = bag_items[i];
                bag_items[i] = smalls;    
            }       
        }
    }
    // if x is true, sort from smallest to largest
    // Merge Sort, because recursion looked like a good idea at the time...
    public T[] mergeSort(boolean x, T[] _bag){
        //base case
        if(_bag.length <= 1) return _bag;
        
        //create halves
        T[] topHalf = (T[]) new Object[_bag.length/2];
        T[] botHalf = (T[]) new Object[_bag.length - topHalf.length];
        
        //copy into halves
        System.arraycopy(_bag, 0, topHalf, 0, topHalf.length);
        System.arraycopy(_bag, topHalf.length, botHalf, 0, botHalf.length);
        
        //sort halves
        mergeSort(x,topHalf);
        mergeSort(x,botHalf);
        
        //merge the halves, send type of sort to be used
        merge(topHalf, botHalf, _bag, x);
        
        return _bag;
    }
    //Somewhat borrowed from Carnegie Mellon University Computer Science
    //https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/code/MergeSort.java
    private void merge(T[] first, T[] second, T[] result, boolean sort_type){
        //Index Position in first array - starting with first element
        int idx_top = 0;
         
        //Index Position in second array - starting with first element
        int idx_bottom = 0;
         
        //Index Position in merged array - starting with first position
        int idx_merged = 0;
         
        //Compare elements at idx_top and idx_bot, 
        //and move smaller element at idx_merged
        
        if(sort_type == true){
            while (idx_top < first.length && idx_bottom < second.length){
                //made this to avoid using Comparable[]
                Integer top = Integer.valueOf(first[idx_top].toString().replace(".", ""));
                Integer bot = Integer.valueOf(second[idx_bottom].toString().replace(".", ""));
                int comparator = top - bot;
                if (comparator < 0){
                    result[idx_merged] = first[idx_top];
                    idx_top++;
                } 
                else{
                    result[idx_merged] = second[idx_bottom];
                    idx_bottom++;
                }
                idx_merged++;
            }
        }
        //Compare elements at idx_top and idx_bot, 
        //and move larger element at idx_merged
        else if(sort_type == false){
            while (idx_top < first.length && idx_bottom < second.length){
                //made this to avoid using Comparable[]
                Integer top = Integer.valueOf(first[idx_top].toString().replace(".", ""));
                Integer bot = Integer.valueOf(second[idx_bottom].toString().replace(".", ""));
                int comparator = top - bot;
                if (comparator > 0){
                    result[idx_merged] = first[idx_top];
                    idx_top++;
                } 
                else{
                    result[idx_merged] = second[idx_bottom];
                    idx_bottom++;
                }
                idx_merged++;
            }
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(first, idx_top, result, idx_merged, first.length - idx_top);
        System.arraycopy(second, idx_bottom, result, idx_merged, second.length - idx_bottom);
    }
    
    public T[] mergeSort(boolean x){
        //this method is for merge-sorting current bag
        T[] a = this.toArray();
        
        return mergeSort(x, a);
        
    }
}
