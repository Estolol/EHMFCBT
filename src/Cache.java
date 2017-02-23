import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.Math;
import java.io.IOException;

public class Cache{
  int id;
  HashSet<Video> videos;
  int size_left;

  public Cache(int id, int X){
    this.id = id;
    videos = new HashSet<Video>();
    size_left = X;
  }

  void add(Video v){
    videos.add(v);
    size_left -= v.size;
    if(size_left < 0){
      System.out.println("negative cache size");
    }
  }

  @Override
  public String toString(){
    String out = Integer.toString(id);
    for(Video vid:videos)
      out+=" "+vid.id;
    return out;
  }

}
