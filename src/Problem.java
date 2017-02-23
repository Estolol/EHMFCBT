import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.Math;

public class Problem{

  int videos, endpoints, requests, cache, capacity;
  int[] size, latency_dc, connected_caches, requests_video, requests_endpoint, requests_number;;
  int[][] cache_id, latency_cache;

  public Problem(Scanner in){
    this.videos = in.nextInt();
    System.out.println(videos);
    this.endpoints = in.nextInt();
    this.requests = in.nextInt();
    this.cache = in.nextInt();
    this.capacity = in.nextInt();
    size = new int[this.videos];
    for (int i = 0; i < videos; i ++) {
      size[i] = in.nextInt();
    }
    this.latency_dc = new int[this.endpoints];
    this.connected_caches = new int[this.endpoints];
    cache_id = new int[this.endpoints][];
    latency_cache = new int[this.endpoints][];
    for(int j = 0; j < endpoints;j++){
      latency_dc[j] = in.nextInt();
      connected_caches[j] = in.nextInt();
      cache_id[j] = new int[connected_caches[j]];
      latency_cache[j] = new int[connected_caches[j]];
      for (int i = 0; i < connected_caches[j]; i++) {
        cache_id[j][i] = in.nextInt();
        latency_cache[j][i] = in.nextInt();
      }
    }

    requests_video = new int[requests];
    requests_endpoint = new int[requests];
    requests_number = new int[requests];
    for (int i = 0; i < requests; i++) {
      requests_video[i] = in.nextInt();
      requests_endpoint[i] = in.nextInt();
      requests_number[i] = in.nextInt();
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
