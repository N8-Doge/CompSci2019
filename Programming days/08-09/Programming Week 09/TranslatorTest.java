import java.util.*;

/**
 * The test class RationalCounterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TranslatorTest extends junit.framework.TestCase
{
	public void testTranslator01()
	{
       String[] dictionary = {"PROGRAMMING", "LOVE", "COMPUTER", "CONTEST"};
       String[] story = {"I", "ELVO", "OREPMTCU", "ROMNRGMPIGA", "ESNCTTO"};
       
       String[] solution = {"I", "LOVE", "COMPUTER", "PROGRAMMING", "CONTEST"};
       
       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator02()
	{
       String[] dictionary = {"TEARS", "SEARS", "STARS", "STALE", "STILE", "SMILE", "OF", "THE"};
       String[] story = {"A", "SSERA", "RTASE", "TAESL", "HTE", "STRSA", "SMILE", "OF", "ESTIL"};

       String[] solution = {"A", "SEARS", "TEARS", "STALE", "THE", "STARS", "SMILE", "OF", "STILE"};
       
       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator03()
	{
       String[] dictionary = {"GRASS", "BE", "CRASS", "CRESS", "TRESS", "TREES", "AND", "TREEN", "GREEN", "OF", "WILL", "FAST"};
       String[] story = {"EB", "CSRES", "OF", "GSSRA", "WLLI", "REENT", "EENGR", "EETRS", "SAFT", "DNA", "SCRAS", "ETRSS"};
       
       String[] solution = {"BE", "CRESS", "OF", "GRASS", "WILL", "TREEN", "GREEN", "TREES", "FAST", "AND", "CRASS", "TRESS"};
       
       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator04()
	{
       String[] dictionary = {"CAT", "COT", "DOT", "DOG", "OF", "OFF", "BE", "BEE", "BEEN", "BEN", "THERE", "TREE"};
       String[] story = {"ODG", "BE", "TCA", "FO", "DTO", "FOF", "ENB", "TREEH", "OTC", "OF", "OFF", "ERTE", "EBNE", "BE", "FOF", "EBE"};
       
       String[] solution = {"DOG", "BE", "CAT", "OF", "DOT", "OFF", "BEN", "THERE", "COT", "OF", "OFF", "TREE", "BEEN", "BE", "OFF", "BEE"};
       
       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator05()
	{
       String[] dictionary = {"aRMy", "aRMS", "AIMS", "DIms", "Dams", "damE", "nAmE", "NavE", "nAVY"};
       String[] story = {"iAms", "emda", "smda", "raym", "msar", "idsm", "eadm", "yvNa", "nave", "amne"};

       String[] solution = {"AIMS", "damE", "Dams", "aRMy", "aRMS", "DIms", "damE", "nAVY", "NavE", "nAmE"};

       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator06()
	{
       String[] dictionary = {"AA", "AAB", "BAAB", "BAABC", "CBAABC", "DCBAABC", "DCBAABCD"};
       String[] story = {"AA", "BCACBAD", "ABAB", "DCBAABC", "BAAB","CBAABC", "AAB", 
                         "AA", "DCBAABCD", "AAB",  "CBAABC", "BAABC", "BAABC", "DCBAABCD",};

       String[] solution = {"AA", "DCBAABC", "BAAB", "DCBAABC", "BAAB","CBAABC", "AAB", 
                            "AA", "DCBAABCD", "AAB",  "CBAABC", "BAABC", "BAABC", "DCBAABCD",};

       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator07()
	{
       String[] dictionary = {"BLUE", "GLUE", "GLUT", "GOUT", "POUT", "PORT", "PART", "PANT", "PINT", "PINK", "three",
                               "MICE", "MITE", "Small", "creature", "MATE", "Win", "at", "chess", "MATS", "with",
                               "Floor", "coverings", "RATS", "the", "and", "ink", "hope", "of", "that", "hat", "due"};
                               
       String[] story = {"A", "lube", "niPT", "Fo", "PkiN", "NKI", "LEgu",
                            "ETh", "GUtl", "MsaLl", "TPou", "GtOU", "Edu",
                            "INw", "tA", "cshes", "atht", "iTmE", "ORPT", "ReAeRuTc", 
                            "TAPR", "atNp", "IcEM", "Nda", "TArs", "TtHa", "OPHE",
                            "MEat", "rFOLo", "INerGoVcs", "and", "TsMA", "ithW", "EThre", "aHt"};

       String[] solution = {"A", "BLUE", "PINT", "of", "PINK", "ink", "GLUE",
                            "the", "GLUT", "Small", "POUT", "GOUT", "due",
                            "Win", "at", "chess", "that", "MITE", "PORT", "creature", 
                            "PART", "PANT", "MICE", "and", "RATS", "that", "hope",
                            "MATE", "Floor", "coverings", "and", "MATS", "with", "three", "hat"};

       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator08()
	{
       String[] dictionary = {"ABCD"};
                               
       String[] story = {"ABCD", "ABDC", "ACBD", "ACDB", "ADBC", "ADCB",
                         "BACD", "BADC", "BCAD", "BCDA", "BDAC", "BDCA",
                         "CABD", "CADB", "CBAD", "CBDA", "CDAB", "CDBA",
                         "DABC", "DACB", "DBAC", "DBCA", "DCBA", "DCAB"};

       String[] solution = {"ABCD", "ABCD", "ABCD", "ABCD", "ABCD", "ABCD",
                            "ABCD", "ABCD", "ABCD", "ABCD", "ABCD", "ABCD",
                            "ABCD", "ABCD", "ABCD", "ABCD", "ABCD", "ABCD",
                            "ABCD", "ABCD", "ABCD", "ABCD", "ABCD", "ABCD"};

       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
           System.out.println(word);
          assertEquals(word, solution[index]);
          index++;
        }
    }

    public void testTranslator09()
	{
       String[] dictionary = {"ABCD"};
                               
       String[] story = {"abcd", "abdC", "acBd", "acDB", "aDbc", "aDcB",
                         "bACd", "bADC", "Bcad", "BcdA", "BdAc", "BdCA",
                         "CAbd", "CAdB", "CBAd", "CBDA"};

       String[] solution = {"ABCD", "ABCD", "ABCD", "ABCD", "ABCD", "ABCD",
                            "ABCD", "ABCD", "ABCD", "ABCD", "ABCD", "ABCD",
                            "ABCD", "ABCD", "ABCD", "ABCD"};

       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
           System.out.println(word);
          assertEquals(word, solution[index]);
          index++;
        }
    }

    public void testTranslator10()
	{
       String[] dictionary = {"if", "static", "do", "for", "while", "public", "private", "double", 
                              "Integer", "String", "int", "class", "BST", "AP", "CS", "void"};
                               
       String[] story = {"fro", "ilwhE", "fI", "BLpUic", "pteriva", "bdoleu", "taTsiC", "OD",
                              "void", "nteIger", "ringSt", "TNi", "laScS", "sTb", "pA", "sc",};

       String[] solution = {"for", "while", "if", "public", "private", "double", "static", "do",
                              "void", "Integer", "String", "int", "class", "BST", "AP", "CS",};

       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
           System.out.println(word);
          assertEquals(word, solution[index]);
          index++;
        }
    }
}