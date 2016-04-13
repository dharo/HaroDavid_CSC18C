public final class Bag<T> implements BagInterface<T> {
    @SuppressWarnings("FieldMayBeFinal")
    private T[] bag_items;
    private int defaultBagSize = 3;
    private int numberOfEntries;
    private int growth = 5;        //when no space in bag, increase by 50
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
            System.out.println("Increasing size of bag...");
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
}
