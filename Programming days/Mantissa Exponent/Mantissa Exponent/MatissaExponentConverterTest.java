public class MatissaExponentConverterTest extends junit.framework.TestCase
{

    public void testToMatissaExponent01()
    {
        assertEquals("011000 0100", MatissaExponentConverter.toMatissaExponent(12.0, 6, 4));
        assertEquals("np", MatissaExponentConverter.toMatissaExponent(128.+64.+16.+8.+2., 6, 4));
        assertEquals("np", MatissaExponentConverter.toMatissaExponent(16.+8.+2.+1., 6, 3));
        assertEquals("0101110100 000101", MatissaExponentConverter.toMatissaExponent(23.25, 10, 6));
        assertEquals("00000 00000", MatissaExponentConverter.toMatissaExponent(0,5,5));
        
        //custom tester
        assertEquals("0100001100 000111", MatissaExponentConverter.toMatissaExponent(67,10,6));
        assertEquals("01111011111 000111", MatissaExponentConverter.toMatissaExponent(123.875,11,6));
        assertEquals("01000000001 001000", MatissaExponentConverter.toMatissaExponent(128.25,11,6));
        assertEquals("110000 111010", MatissaExponentConverter.toMatissaExponent(-0.0078125,6,6));
        assertEquals("110000 010111", MatissaExponentConverter.toMatissaExponent(-4194304,6,6));
        assertEquals("0110 100", MatissaExponentConverter.toMatissaExponent(0.046875,4,3));
    }

    public void testToDouble01()
    {
        assertEquals(7.0, MatissaExponentConverter.toDouble("011100 00011"));
        assertEquals((2*2*2*(-1+1/2.+1/8.)), MatissaExponentConverter.toDouble("110100 00011"), 0.05);
    }
}