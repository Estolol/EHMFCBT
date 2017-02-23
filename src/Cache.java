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
  LinkedList<Video> videos;
  int size_left;

  public Cache(int id, int X){
    this.id = id;
    videos = new LinkedList<Video>();
    size_left = X;
  }

  @Override
  public String toString(){
    String out = Integer.toString(id);
    for(Video vid:videos)
      out+=" "+vid.id;
    return out;
  }

}
