import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.Math;

public class Problem{

  int V, E, R, C, X, Ld, K;
  int[] S, c, Lc, Rv, Re, Rn;

  public Problem(Scanner in){
    this.V = in.nextInt();
    System.out.println(V);
    this.E = in.nextInt();
    this.R = in.nextInt();
    this.C = in.nextInt();
    this.X = in.nextInt();
    S = new int[this.V];
    for (int i = 0; i < V; i ++) {
      S[i] = in.nextInt();
    }

    this.Ld = in.nextInt();
    this.K = in.nextInt();
    c = new int[K];
    Lc = new int[K];
    for (int i = 0; i < K; i++) {
      c[i] = in.nextInt();
      Lc[i] = in.nextInt();
    }

    Rv = new int[R];
    Re = new int[R];
    Rn = new int[R];
    for (int i = 0; i < R; i++) {
      Rv[i] = in.nextInt();
      Re[i] = in.nextInt();
      Rn[i] = in.nextInt();
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
