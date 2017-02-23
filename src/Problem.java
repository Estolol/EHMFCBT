import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.Math;

public class Problem{
  Video[] videos;
  LinkedList<Request> requests;
  Cache[] caches;
  Endpoint[] endpoints;
  int videos_num, endpoints_num, requests_num, cache_num, capacity;

  public Problem(Scanner in){
    videos_num = in.nextInt();
    System.out.println(videos_num);
    this.endpoints_num = in.nextInt();
    this.requests_num = in.nextInt();
    this.cache_num = in.nextInt();
    this.capacity = in.nextInt();
    videos = new Video[this.videos_num];
    for (int i = 0; i < videos_num; i ++) {
      videos[i] = new Video(i,in.nextInt());
    }
    endpoints = new Endpoint[this.endpoints_num];
    for(int j = 0; j < endpoints_num;j++){
      endpoints[j] = new Endpoint(in.nextInt(),in.nextInt());
      for (int i = 0; i < endpoints[j].nb_cache; i++) {
        endpoints[j].add(in.nextInt(), in.nextInt());
      }
    }

    requests = new LinkedList<Request>();
    for (int i = 0; i < requests_num; i++) {
      requests.add(new Request(in.nextInt(),in.nextInt(),in.nextInt()));
    }

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
