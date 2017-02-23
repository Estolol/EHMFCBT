import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.Math;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.Math;
import java.io.IOException;

public class test {
  public static void main(String[] args) throws IOException {
        String base = args[0];
        Scanner in = new Scanner(new File("input/"+base+".in"));
        Problem pb = new Problem(in);
        pb.solve("output/"+base+".out");
  }
}
