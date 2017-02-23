import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.Math;
import java.io.IOException;

public class Cache{

  LinkedList<Video> videos;
  int size_left;

  public cache(int X){
    videos = new LinkedList<Video>();
    size_left = X;
  }

}
