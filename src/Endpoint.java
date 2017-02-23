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
  LinkedList<Integer> sorted_caches;

  public Endpoint(int Ld, int nb_cache){
    this.Ld = Ld;
    this.nb_cache = nb_cache;
    caches = new HashMap<Integer, Integer>(nb_cache);
    sorted_caches = new LinkedList<Integer>();
  }

  public void add(int cache_id, int latency){
    caches.put(cache_id, latency);
    sorted_caches.add(cache_id);
  }

  public void sort_by_cache_size(){
    Collections.sort(sorted_caches,
      new Comparator<Integer>(){
        @Override
        public int compare(Integer a, Integer b){
          return Integer.compare(caches.get(a), caches.get(b));
        }
      }
    );
  }
}
