import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_9372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int[] total = new int[T];
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int s = 0;
            int e = 0;
            int[] check = new int[N+1];
            ArrayList<ArrayList<Integer>> trip = new ArrayList<ArrayList<Integer>>();
            for(int j = 0; j <= M+1; j++){
                trip.add(new ArrayList<>());
            }
            for(int j = 0; j < M; j++){
                st = new StringTokenizer(br.readLine());
                s = Integer.parseInt(st.nextToken());
                e = Integer.parseInt(st.nextToken());
                trip.get(s).add(e);
                trip.get(e).add(s);
            }
            int answer = 1;
            Queue<Integer> q = new LinkedList<>();
            q.offer(s);
            check[s] = 1;
            check[e] = 1;
            while(!q.isEmpty()){
                int y = q.poll();
                for(int next : trip.get(y)){
                    if(check[next] == 0){
                        check[next] = 1;
                        answer += 1;
                        q.offer(next);
                    }
                }
            }
            total[i] = answer;
        }
        for(int i = 0; i < T; i++){
            System.out.println(total[i]);
        }
    }
}
