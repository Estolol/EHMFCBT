import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.Math;
import java.io.IOException;

public class Endpoint{

  int Ld;
  int nb_cache;
  HashMap<Integer, Integer> caches;

  public Endpoint(int Ld, int nb_cache){
    this.Ld = Ld;
    this.nb_cache = nb_cache;
    caches = new HashMap<Integer, Integer>(nb_cache);
  }

  
}
