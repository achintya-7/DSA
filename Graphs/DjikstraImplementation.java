package Graphs;

import java.util.PriorityQueue;

public class DjikstraImplementation {
    public static class Pair {
        int v; // visited
        String psf; // path so far
        int wsf; // weight so far

        Pair(int v, String psf, int wsf){
            this.v = v;
            this.psf = psf;
            this.wsf = wsf;
        }
    }
    
    public static void main(String[] args) {
        int src = 0;
        int vtces = 10;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, src + "", 0));
        boolean[] visited = new boolean[vtces];

        while(pq.size() > 0){
            Pair rem = pq.remove();
            
            if(visited[rem.v] == true){
                continue;
            }

            visited[rem.v] = true; // marker 
            System.out.println(rem.v + " via " + rem.psf + " @ " + rem.psf);

            
        }
    }
}
