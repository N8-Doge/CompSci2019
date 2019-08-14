public class TranslatorTest_student extends junit.framework.TestCase
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
}