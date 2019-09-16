import java.lang.*;

/**
 * The test class for SinglyLinkedListTest for Part B
 * 
 *    test the following methods
 *       toString()
 *       add(int, Object)
 *       get(int)
 *       getNodeAtIndex(int)
 *       size()
 *       contains(Object)
 *       isEmpty()
 */
public class StudentLinkedListPartATest extends junit.framework.TestCase
{
    public void testPartA()
    {
        SinglyLinkedList obj = new SinglyLinkedList();
        assertEquals(true, obj.isEmpty());
        System.out.println("start");
        obj.add(0, "2");            // 2
        assertEquals(false, obj.isEmpty());
        System.out.println("A");
        assertEquals("[2]", obj.toString());
        System.out.println("B");
        obj.add(1, "2222222");      // 2 2222222
        System.out.println("C");
        obj.add(1, "-4");           // 2 -4 2222222
        System.out.println("D");
        assertEquals(3, obj.size());
        System.out.println("E");
        assertEquals("2", obj.get(0));
        System.out.println("F");
        assertEquals("-4", obj.getNodeAtIndex(1).getValue());
        System.out.println("G");
        assertEquals(false, obj.contains("12"));
        assertEquals(true, obj.contains("2222222"));
    }
}