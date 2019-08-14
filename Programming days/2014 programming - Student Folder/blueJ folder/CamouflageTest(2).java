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

    public void testCamouflage02() {   //   all caps - linear search
        Camouflage baseWord = new Camouflage("PROGRAMMINGCONTEST");

        assertEquals(true, baseWord.linearSearch("PRGMMTEST"));
        assertEquals(true, baseWord.linearSearch("ROOT"));
        assertEquals(true, baseWord.linearSearch("RATS"));
        assertEquals(true, baseWord.linearSearch("ORION"));
        assertEquals(true, baseWord.linearSearch("ROAMING"));

        assertEquals(false, baseWord.linearSearch("MISTT"));
        assertEquals(false, baseWord.linearSearch("POSS"));
        assertEquals(false, baseWord.linearSearch("COMTEST"));
        assertEquals(false, baseWord.linearSearch("PROGRAMMINGCONTESTS"));
    }

    public void testCamouflage03() {   //   all caps - reverse search
        Camouflage baseWord = new Camouflage("PROGRAMMINGCONTEST");

        assertEquals(true, baseWord.reverseSearch("PRGMMTEST"));
        assertEquals(true, baseWord.reverseSearch("ROOT"));
        assertEquals(true, baseWord.reverseSearch("RATS"));
        assertEquals(true, baseWord.reverseSearch("ORION"));
        assertEquals(true, baseWord.reverseSearch("ROAMING"));
        assertEquals(true, baseWord.reverseSearch("PROGRAMMINGCONTESTS"));
        assertEquals(true, baseWord.reverseSearch("PRP"));
        assertEquals(true, baseWord.reverseSearch("PTESTSORP"));
        assertEquals(true, baseWord.reverseSearch("STS"));
        assertEquals(true, baseWord.reverseSearch("PRGGRP"));
        assertEquals(true, baseWord.reverseSearch("MMM"));

        assertEquals(false, baseWord.reverseSearch("MMMMM"));
        assertEquals(false, baseWord.reverseSearch("PGSRM"));
        assertEquals(false, baseWord.reverseSearch("POSSSCOO"));
        assertEquals(false, baseWord.reverseSearch("COMTEST"));
        assertEquals(false, baseWord.reverseSearch("TTTT"));
    }

    public void testCamouflage04() {   //   all caps - circular search
        Camouflage baseWord = new Camouflage("PROGRAMMINGCONTEST");

        assertEquals(true, baseWord.circularSearch("PRGMMTEST"));
        assertEquals(true, baseWord.circularSearch("ROOT"));
        assertEquals(true, baseWord.circularSearch("RATS"));
        assertEquals(true, baseWord.circularSearch("ORION"));
        assertEquals(true, baseWord.circularSearch("ROAMING"));
        assertEquals(true, baseWord.circularSearch("PSTT"));
        assertEquals(true, baseWord.circularSearch("PROGRAMMINGCONTEST"));
        assertEquals(true, baseWord.circularSearch("TSETNOCGNIMMARGROP"));
        assertEquals(true, baseWord.circularSearch("PORMIGOTSRGAMNCNET"));
        assertEquals(true, baseWord.circularSearch("RROOMMNNGGTT"));
        assertEquals(true, baseWord.circularSearch("MISTT"));
        assertEquals(true, baseWord.circularSearch("COMTEST"));

        assertEquals(false, baseWord.circularSearch("PROGRAMMINGCONTESTS"));
        assertEquals(false, baseWord.circularSearch("RRR"));
        assertEquals(false, baseWord.circularSearch("BOAR"));
        assertEquals(false, baseWord.circularSearch("POSS"));
        assertEquals(false, baseWord.circularSearch("COMNNTESTN"));
        assertEquals(false, baseWord.circularSearch("COMNZNTEST"));
        assertEquals(false, baseWord.circularSearch("PROGRAMMINGCONTESTS"));
    }

    public void testCamouflage05() {   //   mixed case - linear search
        Camouflage baseWord = new Camouflage("ProgrammingContest");

        assertEquals(true, baseWord.linearSearch("PrGmmTEsT"));
        assertEquals(true, baseWord.linearSearch("RooT"));
        assertEquals(true, baseWord.linearSearch("p"));
        assertEquals(true, baseWord.linearSearch("RAtS"));
        assertEquals(true, baseWord.linearSearch("OriOn"));
        assertEquals(true, baseWord.linearSearch("RoAmInG"));
        assertEquals(true, baseWord.linearSearch("pROGRAMMINGcONTEST"));

        assertEquals(false, baseWord.linearSearch("MistT"));
        assertEquals(false, baseWord.linearSearch("PosS"));
        assertEquals(false, baseWord.linearSearch("COmtESt"));
        assertEquals(false, baseWord.linearSearch("pROGRAMMINGcONTESTS"));

        baseWord = new Camouflage("ILoveJava");
        assertEquals(true, baseWord.linearSearch("Love"));
        assertEquals(true, baseWord.linearSearch("IJava"));
        assertEquals(true, baseWord.linearSearch("IA"));
        assertEquals(false, baseWord.linearSearch("ILoveu"));
        assertEquals(false, baseWord.linearSearch("ILoveJavaa"));
        assertEquals(false, baseWord.linearSearch("aei"));
    }

    public void testCamouflage06() {   //   mixed case - reverse search
        Camouflage baseWord = new Camouflage("ProgrammingContest");

        assertEquals(true, baseWord.reverseSearch("pRgmMTest"));
        assertEquals(true, baseWord.reverseSearch("rOOt"));
        assertEquals(true, baseWord.reverseSearch("rATs"));
        assertEquals(true, baseWord.reverseSearch("orIOn"));
        assertEquals(true, baseWord.reverseSearch("rOaMiNg"));
        assertEquals(true, baseWord.reverseSearch("pROGRAMMINGcONTESTS"));
        assertEquals(true, baseWord.reverseSearch("pRp"));
        assertEquals(true, baseWord.reverseSearch("PtestSorP"));
        assertEquals(true, baseWord.reverseSearch("StS"));
        assertEquals(true, baseWord.reverseSearch("pRGGRp"));
        assertEquals(true, baseWord.reverseSearch("MmM"));

        assertEquals(false, baseWord.reverseSearch("MmMmM"));
        assertEquals(false, baseWord.reverseSearch("Pgsrm"));
        assertEquals(false, baseWord.reverseSearch("POsssCoo"));
        assertEquals(false, baseWord.reverseSearch("comtest"));
        assertEquals(false, baseWord.reverseSearch("TttT"));

        baseWord = new Camouflage("ILoveApples");
        assertEquals(true, baseWord.reverseSearch("Applesevol"));
        assertEquals(true, baseWord.reverseSearch("I"));
        assertEquals(true, baseWord.reverseSearch("Ili"));
        assertEquals(false, baseWord.reverseSearch("ApplesLove"));
        assertEquals(false, baseWord.reverseSearch("ILoveu"));
        assertEquals(false, baseWord.reverseSearch("ILovess"));
        assertEquals(false, baseWord.reverseSearch("aeio"));
  }

    public void testCamouflage07() {   //   mixed case - circular search
        Camouflage baseWord = new Camouflage("ProgrammingContest");

        assertEquals(true, baseWord.circularSearch("pRGmMTesT"));
        assertEquals(true, baseWord.circularSearch("root"));
        assertEquals(true, baseWord.circularSearch("rats"));
        assertEquals(true, baseWord.circularSearch("OrioN"));
        assertEquals(true, baseWord.circularSearch("rOamIng"));
        assertEquals(true, baseWord.circularSearch("pSTT"));
        assertEquals(true, baseWord.circularSearch("pROGRAMMINGcONTEST"));
        assertEquals(true, baseWord.circularSearch("TSETNOcGNIMMARGROp"));
        assertEquals(true, baseWord.circularSearch("pORMIGOTSRGAMNcNET"));
        assertEquals(true, baseWord.circularSearch("RroomMNNggTT"));
        assertEquals(true, baseWord.circularSearch("mIsTt"));
        assertEquals(true, baseWord.circularSearch("comTesT"));

        assertEquals(false, baseWord.circularSearch("pROGRAMMINGcONTESTS"));
        assertEquals(false, baseWord.circularSearch("RrR"));
        assertEquals(false, baseWord.circularSearch("BoaR"));
        assertEquals(false, baseWord.circularSearch("Poss"));
        assertEquals(false, baseWord.circularSearch("COMNNTESTn"));
        assertEquals(false, baseWord.circularSearch("ComNZNtest"));
        assertEquals(false, baseWord.circularSearch("ProgrammingContests"));

        baseWord = new Camouflage("ILoveCircles");
        assertEquals(true, baseWord.circularSearch("CirclesIlove"));
        assertEquals(true, baseWord.circularSearch("I"));
        assertEquals(true, baseWord.circularSearch("Ililes"));
        assertEquals(true, baseWord.circularSearch("IcCeve"));
        assertEquals(true, baseWord.circularSearch("Isi"));
        assertEquals(false, baseWord.circularSearch("Lovecco"));
        assertEquals(false, baseWord.circularSearch("IcCevese"));
        assertEquals(false, baseWord.circularSearch("ILovess"));
        assertEquals(false, baseWord.circularSearch("aeio"));
    }

    public void testCamouflage08() {   //   all caps - linear, reverse and circular search
        Camouflage baseWord = new Camouflage("PROGRAMMINGCONTEST");

        assertEquals(true, baseWord.linearSearch("PRGMMTEST"));
        assertEquals(true, baseWord.linearSearch("ROOT"));
        assertEquals(true, baseWord.linearSearch("RATS"));
        assertEquals(true, baseWord.linearSearch("ORION"));
        assertEquals(true, baseWord.linearSearch("ROAMING"));

        assertEquals(false, baseWord.linearSearch("MISTT"));
        assertEquals(false, baseWord.linearSearch("POSS"));
        assertEquals(false, baseWord.linearSearch("COMTEST"));
        assertEquals(false, baseWord.linearSearch("PROGRAMMINGCONTESTS"));

        assertEquals(true, baseWord.reverseSearch("PRGMMTEST"));
        assertEquals(true, baseWord.reverseSearch("ROOT"));
        assertEquals(true, baseWord.reverseSearch("RATS"));
        assertEquals(true, baseWord.reverseSearch("ORION"));
        assertEquals(true, baseWord.reverseSearch("ROAMING"));
        assertEquals(true, baseWord.reverseSearch("PROGRAMMINGCONTESTS"));
        assertEquals(true, baseWord.reverseSearch("PRP"));
        assertEquals(true, baseWord.reverseSearch("PTESTSORP"));
        assertEquals(true, baseWord.reverseSearch("STS"));
        assertEquals(true, baseWord.reverseSearch("PRGGRP"));
        assertEquals(true, baseWord.reverseSearch("MMM"));

        assertEquals(false, baseWord.reverseSearch("MMMMM"));
        assertEquals(false, baseWord.reverseSearch("PGSRM"));
        assertEquals(false, baseWord.reverseSearch("POSSSCOO"));
        assertEquals(false, baseWord.reverseSearch("COMTEST"));
        assertEquals(false, baseWord.reverseSearch("TTTT"));

        assertEquals(true, baseWord.circularSearch("PRGMMTEST"));
        assertEquals(true, baseWord.circularSearch("ROOT"));
        assertEquals(true, baseWord.circularSearch("RATS"));
        assertEquals(true, baseWord.circularSearch("ORION"));
        assertEquals(true, baseWord.circularSearch("ROAMING"));
        assertEquals(true, baseWord.circularSearch("PSTT"));
        assertEquals(true, baseWord.circularSearch("PROGRAMMINGCONTEST"));
        assertEquals(true, baseWord.circularSearch("TSETNOCGNIMMARGROP"));
        assertEquals(true, baseWord.circularSearch("PORMIGOTSRGAMNCNET"));
        assertEquals(true, baseWord.circularSearch("RROOMMNNGGTT"));
        assertEquals(true, baseWord.circularSearch("MISTT"));
        assertEquals(true, baseWord.circularSearch("COMTEST"));

        assertEquals(false, baseWord.circularSearch("PROGRAMMINGCONTESTS"));
        assertEquals(false, baseWord.circularSearch("RRR"));
        assertEquals(false, baseWord.circularSearch("BOAR"));
        assertEquals(false, baseWord.circularSearch("POSS"));
        assertEquals(false, baseWord.circularSearch("COMNNTESTN"));
        assertEquals(false, baseWord.circularSearch("COMNZNTEST"));
        assertEquals(false, baseWord.circularSearch("PROGRAMMINGCONTESTS"));
  } 

    public void testCamouflage09() {   //   mixed case - linear, reverse and circular search
        Camouflage baseWord = new Camouflage("ProgrammingContest");

        assertEquals(true, baseWord.linearSearch("PrGmmTEsT"));
        assertEquals(true, baseWord.linearSearch("RooT"));
        assertEquals(true, baseWord.linearSearch("p"));
        assertEquals(true, baseWord.linearSearch("RAtS"));
        assertEquals(true, baseWord.linearSearch("OriOn"));
        assertEquals(true, baseWord.linearSearch("RoAmInG"));
        assertEquals(true, baseWord.linearSearch("pROGRAMMINGcONTEST"));

        assertEquals(false, baseWord.linearSearch("MistT"));
        assertEquals(false, baseWord.linearSearch("PosS"));
        assertEquals(false, baseWord.linearSearch("COmtESt"));
        assertEquals(false, baseWord.linearSearch("pROGRAMMINGcONTESTS"));

        assertEquals(true, baseWord.reverseSearch("pRgmMTest"));
        assertEquals(true, baseWord.reverseSearch("rOOt"));
        assertEquals(true, baseWord.reverseSearch("rATs"));
        assertEquals(true, baseWord.reverseSearch("orIOn"));
        assertEquals(true, baseWord.reverseSearch("rOaMiNg"));
        assertEquals(true, baseWord.reverseSearch("pROGRAMMINGcONTESTS"));
        assertEquals(true, baseWord.reverseSearch("pRp"));
        assertEquals(true, baseWord.reverseSearch("PtestSorP"));
        assertEquals(true, baseWord.reverseSearch("StS"));
        assertEquals(true, baseWord.reverseSearch("pRGGRp"));
        assertEquals(true, baseWord.reverseSearch("MmM"));

        assertEquals(false, baseWord.reverseSearch("MmMmM"));
        assertEquals(false, baseWord.reverseSearch("Pgsrm"));
        assertEquals(false, baseWord.reverseSearch("POsssCoo"));
        assertEquals(false, baseWord.reverseSearch("comtest"));
        assertEquals(false, baseWord.reverseSearch("TttT"));

        assertEquals(true, baseWord.circularSearch("pRGmMTesT"));
        assertEquals(true, baseWord.circularSearch("root"));
        assertEquals(true, baseWord.circularSearch("rats"));
        assertEquals(true, baseWord.circularSearch("OrioN"));
        assertEquals(true, baseWord.circularSearch("rOamIng"));
        assertEquals(true, baseWord.circularSearch("pSTT"));
        assertEquals(true, baseWord.circularSearch("pROGRAMMINGcONTEST"));
        assertEquals(true, baseWord.circularSearch("TSETNOcGNIMMARGROp"));
        assertEquals(true, baseWord.circularSearch("pORMIGOTSRGAMNcNET"));
        assertEquals(true, baseWord.circularSearch("RroomMNNggTT"));
        assertEquals(true, baseWord.circularSearch("mIsTt"));
        assertEquals(true, baseWord.circularSearch("comTesT"));

        assertEquals(false, baseWord.circularSearch("pROGRAMMINGcONTESTS"));
        assertEquals(false, baseWord.circularSearch("RrR"));
        assertEquals(false, baseWord.circularSearch("BoaR"));
        assertEquals(false, baseWord.circularSearch("Poss"));
        assertEquals(false, baseWord.circularSearch("COMNNTESTn"));
        assertEquals(false, baseWord.circularSearch("ComNZNtest"));
        assertEquals(false, baseWord.circularSearch("ProgrammingContests"));

        baseWord = new Camouflage("ILoveApples");
        assertEquals(true, baseWord.reverseSearch("Applesevol"));
        assertEquals(true, baseWord.reverseSearch("I"));
        assertEquals(true, baseWord.reverseSearch("Ili"));
        assertEquals(false, baseWord.reverseSearch("ApplesLove"));
        assertEquals(false, baseWord.reverseSearch("ILoveu"));
        assertEquals(false, baseWord.reverseSearch("ILovess"));
        assertEquals(false, baseWord.reverseSearch("aeio"));

        baseWord = new Camouflage("ILoveJava");
        assertEquals(true, baseWord.linearSearch("Love"));
        assertEquals(true, baseWord.linearSearch("IJava"));
        assertEquals(true, baseWord.linearSearch("IA"));
        assertEquals(false, baseWord.linearSearch("ILoveu"));
        assertEquals(false, baseWord.linearSearch("ILoveJavaa"));
        assertEquals(false, baseWord.linearSearch("aei"));
    }

    public void testCamouflage10() {   //   all caps and mixed case - linear, reverse and circular search
        Camouflage baseWord = new Camouflage("PROGRAMMINGCONTEST");

        assertEquals(true, baseWord.linearSearch("PRGMMTEST"));
        assertEquals(true, baseWord.linearSearch("ROOT"));
        assertEquals(true, baseWord.linearSearch("RATS"));
        assertEquals(true, baseWord.linearSearch("ORION"));
        assertEquals(true, baseWord.linearSearch("ROAMING"));

        assertEquals(false, baseWord.linearSearch("MISTT"));
        assertEquals(false, baseWord.linearSearch("POSS"));
        assertEquals(false, baseWord.linearSearch("COMTEST"));
        assertEquals(false, baseWord.linearSearch("PROGRAMMINGCONTESTS"));

        assertEquals(true, baseWord.reverseSearch("PRGMMTEST"));
        assertEquals(true, baseWord.reverseSearch("ROOT"));
        assertEquals(true, baseWord.reverseSearch("RATS"));
        assertEquals(true, baseWord.reverseSearch("ORION"));
        assertEquals(true, baseWord.reverseSearch("ROAMING"));
        assertEquals(true, baseWord.reverseSearch("PROGRAMMINGCONTESTS"));
        assertEquals(true, baseWord.reverseSearch("PRP"));
        assertEquals(true, baseWord.reverseSearch("PTESTSORP"));
        assertEquals(true, baseWord.reverseSearch("STS"));
        assertEquals(true, baseWord.reverseSearch("PRGGRP"));
        assertEquals(true, baseWord.reverseSearch("MMM"));

        assertEquals(false, baseWord.reverseSearch("MMMMM"));
        assertEquals(false, baseWord.reverseSearch("PGSRM"));
        assertEquals(false, baseWord.reverseSearch("POSSSCOO"));
        assertEquals(false, baseWord.reverseSearch("COMTEST"));
        assertEquals(false, baseWord.reverseSearch("TTTT"));

        assertEquals(true, baseWord.circularSearch("PRGMMTEST"));
        assertEquals(true, baseWord.circularSearch("ROOT"));
        assertEquals(true, baseWord.circularSearch("RATS"));
        assertEquals(true, baseWord.circularSearch("ORION"));
        assertEquals(true, baseWord.circularSearch("ROAMING"));
        assertEquals(true, baseWord.circularSearch("PSTT"));
        assertEquals(true, baseWord.circularSearch("PROGRAMMINGCONTEST"));
        assertEquals(true, baseWord.circularSearch("TSETNOCGNIMMARGROP"));
        assertEquals(true, baseWord.circularSearch("PORMIGOTSRGAMNCNET"));
        assertEquals(true, baseWord.circularSearch("RROOMMNNGGTT"));
        assertEquals(true, baseWord.circularSearch("MISTT"));
        assertEquals(true, baseWord.circularSearch("COMTEST"));

        assertEquals(false, baseWord.circularSearch("PROGRAMMINGCONTESTS"));
        assertEquals(false, baseWord.circularSearch("RRR"));
        assertEquals(false, baseWord.circularSearch("BOAR"));
        assertEquals(false, baseWord.circularSearch("POSS"));
        assertEquals(false, baseWord.circularSearch("COMNNTESTN"));
        assertEquals(false, baseWord.circularSearch("COMNZNTEST"));
        assertEquals(false, baseWord.circularSearch("PROGRAMMINGCONTESTS"));

        baseWord = new Camouflage("ProgrammingContest");

        assertEquals(true, baseWord.linearSearch("PrGmmTEsT"));
        assertEquals(true, baseWord.linearSearch("RooT"));
        assertEquals(true, baseWord.linearSearch("p"));
        assertEquals(true, baseWord.linearSearch("RAtS"));
        assertEquals(true, baseWord.linearSearch("OriOn"));
        assertEquals(true, baseWord.linearSearch("RoAmInG"));
        assertEquals(true, baseWord.linearSearch("pROGRAMMINGcONTEST"));

        assertEquals(false, baseWord.linearSearch("MistT"));
        assertEquals(false, baseWord.linearSearch("PosS"));
        assertEquals(false, baseWord.linearSearch("COmtESt"));
        assertEquals(false, baseWord.linearSearch("pROGRAMMINGcONTESTS"));

        assertEquals(true, baseWord.reverseSearch("pRgmMTest"));
        assertEquals(true, baseWord.reverseSearch("rOOt"));
        assertEquals(true, baseWord.reverseSearch("rATs"));
        assertEquals(true, baseWord.reverseSearch("orIOn"));
        assertEquals(true, baseWord.reverseSearch("rOaMiNg"));
        assertEquals(true, baseWord.reverseSearch("pROGRAMMINGcONTESTS"));
        assertEquals(true, baseWord.reverseSearch("pRp"));
        assertEquals(true, baseWord.reverseSearch("PtestSorP"));
        assertEquals(true, baseWord.reverseSearch("StS"));
        assertEquals(true, baseWord.reverseSearch("pRGGRp"));
        assertEquals(true, baseWord.reverseSearch("MmM"));

        assertEquals(false, baseWord.reverseSearch("MmMmM"));
        assertEquals(false, baseWord.reverseSearch("Pgsrm"));
        assertEquals(false, baseWord.reverseSearch("POsssCoo"));
        assertEquals(false, baseWord.reverseSearch("comtest"));
        assertEquals(false, baseWord.reverseSearch("TttT"));

        assertEquals(true, baseWord.circularSearch("pRGmMTesT"));
        assertEquals(true, baseWord.circularSearch("root"));
        assertEquals(true, baseWord.circularSearch("rats"));
        assertEquals(true, baseWord.circularSearch("OrioN"));
        assertEquals(true, baseWord.circularSearch("rOamIng"));
        assertEquals(true, baseWord.circularSearch("pSTT"));
        assertEquals(true, baseWord.circularSearch("pROGRAMMINGcONTEST"));
        assertEquals(true, baseWord.circularSearch("TSETNOcGNIMMARGROp"));
        assertEquals(true, baseWord.circularSearch("pORMIGOTSRGAMNcNET"));
        assertEquals(true, baseWord.circularSearch("RroomMNNggTT"));
        assertEquals(true, baseWord.circularSearch("mIsTt"));
        assertEquals(true, baseWord.circularSearch("comTesT"));

        assertEquals(false, baseWord.circularSearch("pROGRAMMINGcONTESTS"));
        assertEquals(false, baseWord.circularSearch("RrR"));
        assertEquals(false, baseWord.circularSearch("BoaR"));
        assertEquals(false, baseWord.circularSearch("Poss"));
        assertEquals(false, baseWord.circularSearch("COMNNTESTn"));
        assertEquals(false, baseWord.circularSearch("ComNZNtest"));
        assertEquals(false, baseWord.circularSearch("ProgrammingContests"));

        baseWord = new Camouflage("ILoveCircles");
        assertEquals(true, baseWord.circularSearch("CirclesIlove"));
        assertEquals(true, baseWord.circularSearch("I"));
        assertEquals(true, baseWord.circularSearch("Ililes"));
        assertEquals(true, baseWord.circularSearch("IcCeve"));
        assertEquals(true, baseWord.circularSearch("Isi"));
        assertEquals(false, baseWord.circularSearch("Lovecco"));
        assertEquals(false, baseWord.circularSearch("IcCevese"));
        assertEquals(false, baseWord.circularSearch("ILovess"));
        assertEquals(false, baseWord.circularSearch("aeio"));

        baseWord = new Camouflage("ILoveJava");
        assertEquals(true, baseWord.linearSearch("Love"));
        assertEquals(true, baseWord.linearSearch("IJava"));
        assertEquals(true, baseWord.linearSearch("IA"));
        assertEquals(false, baseWord.linearSearch("ILoveu"));
        assertEquals(false, baseWord.linearSearch("ILoveJavaa"));
        assertEquals(false, baseWord.linearSearch("aei"));
    }
}