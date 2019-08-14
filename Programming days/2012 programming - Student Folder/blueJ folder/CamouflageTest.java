import junit.framework.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * Camouflage.java
 *
 * This is the test suite for the Camouflage programming problem.
 *
 * Copyright (c) July 11, 2007 Jeffrey Bosboom.  Licensed under the Creative
 * Commons Attribution-Noncommercial-Share Alike 3.0 License.  Please see
 * http://creativecommons.org/licenses/by-nc-sa/3.0/ for the text of the
 * License.
 */
public class CamouflageTest extends TestCase {
    public void testCamouflage01() {
        Camouflage baseWord = new Camouflage("LINDSAYLOHAN");
        assertEquals(true, baseWord.linearSearch("SALON"));
        assertEquals(false, baseWord.linearSearch("poPCOrn"));
        assertEquals(false, baseWord.reverseSearch("poPCOrn"));
        assertEquals(true, baseWord.reverseSearch("doll"));
        assertEquals(false, baseWord.circularSearch("poPCOrn"));
        assertEquals(true, baseWord.circularSearch("dials"));
    }
}