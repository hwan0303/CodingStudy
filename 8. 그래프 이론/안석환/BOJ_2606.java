import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        boolean[] infected = new boolean[N+1];
        int answer = 0;
        ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= N+1; i++){
            map.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            map.get(s).add(e);
            map.get(e).add(s);
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        infected[1] = true;
        while (!q.isEmpty()){
            int y = q.poll();
            for(int next : map.get(y)){
                if(!infected[next]){
                    infected[next] = true;
                    answer++;
                    q.offer(next);
                }
            }
        }
        System.out.println(answer);
    }
}
