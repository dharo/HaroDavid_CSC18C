import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import LinkedList.*;

public class LinkedListUnitTest {
    
    // member variable for our tests of type: LinkedList
    LinkedList test;
    
    public LinkedListUnitTest() {
    }
    
    @Test
    public void testCreateEmptyLinkedList() {
        test = new LinkedList();
        int expectedValue=0;
        // if size of new empty linked list is zero as expected, then success!
        Assert.assertEquals(expectedValue, test.size() );        
    }
    
    @Test
    public void testCreateLinkedListWithOneItem() {
        test = new LinkedList();
        // add a node with the dataValue of 100
        test.add(100);
        int expectedValue=1;
        // if size of linked list adding the node with value of 100, with 
        // size of 1, then success!
        Assert.assertEquals(expectedValue, test.size() );
        // to "strengthen" this test, meaning that the data value could be 
        // "wrong" but the size is right, let's test to make sure we have
        // our actual value
        int getAtIndex0_expectedValue = 100;
        Assert.assertEquals(getAtIndex0_expectedValue, test.get(0));
    }
    
    @Test
    public void testCreateLinkedListWithOneThousandItem() {
        test = new LinkedList();
        // add a nodes with the dataValues of 1 to 100,000
        for (int i=1;i<=100000;i++)
            test.add(i);
        int expectedValue=100000;
        // if size of linked list adding nodes with values from 1 to 
        // 1,000, with size of 100 thousand, then success!
        Assert.assertEquals(expectedValue, test.size() );
        // to "strengthen" this test, meaning that the data value could be 
        // "wrong" but the size is right, let's test to make sure we have
        // our actual value
        int getAtIndexI;
        for(int i=1;i<=100000;i++)
        {
            getAtIndexI = i;
            Assert.assertEquals(getAtIndexI, test.get(i-1));
        }
    }
}
