public class BagDemo {

    public static void main(String[] args) {
        Bag<String> bag_of_strings = new Bag();
        System.out.println("Size of bag_of_strings (before resizing)=" + bag_of_strings.getBagSize() );
        Integer numberOfelement;
        
        
        
        for(int i=0;i<15;i++){
            numberOfelement = i+1;
            bag_of_strings.add(numberOfelement.toString());
        }
        
        System.out.println("Size of bag_of_strings=" + bag_of_strings.getSize() );
        System.out.println("Contents of bag_of_strings:");
        Object[] a = bag_of_strings.toArray();
        for(int i=0;i<a.length;i++) {
            System.out.printf("a[%d]=%s\n",i,a[i]);
        }        
    }
    
}
