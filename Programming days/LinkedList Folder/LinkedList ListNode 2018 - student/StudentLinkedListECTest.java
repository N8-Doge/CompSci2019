public class StudentLinkedListECTest extends junit.framework.TestCase
{
    public void testEC()
    {
        SinglyLinkedList obj = new SinglyLinkedList();
        obj.add(0, "2");            // 2
        obj.add(1, "2222222");      // 2 2222222
        obj.add(1, "-4");           // 2 -4 2222222
        System.out.println(obj.toString());
        obj.reverse();
        System.out.println(obj.toString());
        assertEquals(3, obj.size());
        assertEquals("-4", obj.get(0));
        assertEquals("2", obj.getNodeAtIndex(1).getValue());
    }
}