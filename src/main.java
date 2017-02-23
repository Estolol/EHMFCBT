import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.Math;

public class main {
  public static void main(String[] args) {
        String base = args[0];
        Scanner in = new Scanner(new File("input/"+base+".in"));
        Problem pb = new Problem(in);
        pb.solve("output/"+base+".out");
  }
}
