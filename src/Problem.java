import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.Math;

public class Problem{

  String lol;

  public Problem(Scanner in){
    this.lol = in.next();
  }

  public void solve(String output){
    // do stuff
    genOutput(output);
  }

  public void genOutput(String output){
    try {
			PrintWriter writer = new PrintWriter(output , "UTF-8");
      writer.println("coucou");
      
      writer.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }


}
