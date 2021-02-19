
package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Application {

    public int countWords(String words){
      String[] sepateWords = StringUtils.split(words, ' ');
      return (sepateWords == null) ? 0 : sepateWords.length;

    }

    public void greet (){
      List<String> greetings = new ArrayList<String>();
      greetings.add("Hello");

      for (String greeting: greetings){
        System.out.println("greetings: " + greeting);
      }
    }

    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	 System.out.println ("Starting Application");
	     Application app = new Application();
       app.greet();
       System.out.println("Count Words " + app.countWords("I have four words"));

    }
}
