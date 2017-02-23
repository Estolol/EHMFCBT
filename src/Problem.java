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
  HashSet<Cache> touched = new HashSet<Cache>();

  public Problem(Scanner in){
    videos_num = in.nextInt();
    System.out.println(videos_num);
    this.endpoints_num = in.nextInt();
    this.requests_num = in.nextInt();
    this.cache_num = in.nextInt();
    this.capacity = in.nextInt();
    this.caches = new Cache[cache_num];
    for(int i=0; i < cache_num;i++){
      caches[i] = new Cache(i,capacity);
    }
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


  public void sortCaches(){
    for(Endpoint e : endpoints)
      e.sort_by_cache_size();
  }

  public void sortRequests(){
    Collections.sort(requests,
      new Comparator<Request>(){
        @Override
        public int compare(Request a, Request b){
          return Float.compare((float)b.number /videos[b.video_id].size, (float)a.number /videos[b.video_id].size);
        }
      }
    );
  }

  public void addVideos(){
    for(Request r : requests){
      Video v = videos[r.video_id];
      Endpoint e = endpoints[r.endpoint_id];
      boolean contains=true;
      Cache best_cache = null;
      for(int i:e.sorted_caches){
        Cache c = caches[i];
        if(c.size_left >= v.size){
          best_cache = c;
          break;
        }
      }
      if(best_cache == null) break;
      for(int i:e.sorted_caches){
        Cache c = caches[i];
        if(c.videos.contains(v) && e.caches.get(best_cache.id)*2 < e.caches.get(c)){
          contains = true;
          break;
        }
      }
      if(!contains){
        for(int i:e.sorted_caches){
          Cache c = caches[i];
          best_cache.add(v);
          touched.add(best_cache);
        }
      }
    }
  }

  public void solve(String output){
    sortCaches();
    sortRequests();
    addVideos();
    genOutput(output);
  }

  public void genOutput(String output){
    try {
			PrintWriter writer = new PrintWriter(output , "UTF-8");
      writer.println(touched.size());
      for(Cache c:touched)
        writer.println(c.toString());
      writer.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }


}
