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
  int current_cache_pos;

  public Endpoint(int Ld, int nb_cache){
    this.Ld = Ld;
    this.nb_cache = nb_cache;
    caches = new HashMap<Integer, Integer>(nb_cache);
    sorted_caches = new LinkedList<Integer>;
  }

  public void add(int cache_id, int latency){
    caches.add(cache_id, latency);
    sorted_caches.add(cache_id);
  }

  public void sort_by_cache_size(){
    Collections.sort(sorted_caches,
      new Comparator<Integer>{
        public int compare(int a, int b){
          return Integer.compare(caches.get(a), caches.get(b));
        }
      }
    )
  }
}
