import java.net.*;
import java.io.*;

public class URLReader {
  //You can put any web address here and it will print the content to the console
  public static final String WEBSITE = "http://www.nytimes.com/services/xml/rss/nyt/Sports.xml";
  
  public static void main(String[] args) throws IOException {

    InputStream in = null;
    try {
      URL u = new URL(WEBSITE);
      in = u.openStream();
      for (int c = in.read(); c != -1; c = in.read()) {
        System.out.write(c);
      }
      in.close();
    } 
    catch (MalformedURLException ex) {
      System.err.println("not a URL Java understands.");
    }
    finally {
      if (in != null) in.close();
    }
  }
}