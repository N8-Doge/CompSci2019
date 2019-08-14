import junit.framework.*;
/*
 * HarshadNumbersTest.java
 *
 * This is the sample solution for the Harshad Numbers programming problem.
 *
 * Copyright (c) June 28, 2007 Jeffrey Bosboom.  Licensed under the Creative
 * Commons Attribution-Noncommercial-Share Alike 3.0 License.  Please see
 * http://creativecommons.org/licenses/by-nc-sa/3.0/ for the text of the
 * License.
 */
public class HarshadNumbersTest extends TestCase {
    public void testHarshadNumbers01() {
        assertEquals(true, HarshadNumbers.isHarshadNumberInBase(60, 10));
        assertEquals(false, HarshadNumbers.isHarshadNumberInBase(61, 10));
        assertEquals(true, HarshadNumbers.isHarshadNumberInBase(16, 16));
        assertEquals(false, HarshadNumbers.isHarshadNumberInBase(16, 10));
        assertEquals(false, HarshadNumbers.isHarshadNumberInBase(16, 11));
        assertEquals(true, HarshadNumbers.isHarshadNumberInBase(36, 16));
    }
}