import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_4963 {
    static int[][] map;
    static int N;
    static int M;
    static ArrayList<Integer> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        answer = new ArrayList<>();
        while(N != 0 && M != 0){
            map = new int[M][N];
            for(int i = 0; i < M; i++){ // 지도 생성
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < N; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int cnt = 0;
            for(int i = 0; i < M; i++){
                for(int j = 0; j < N; j++){
                    if(map[i][j] == 1){
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            answer.add(cnt);
            // 새로운 입력
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }
    public static void dfs(int x, int y){
        if(x >= M || x < 0 || y >= N || y < 0){
            return;
        }
        if(map[x][y] == 1){
            map[x][y] = 2;
            dfs(x+1,y);
            dfs(x-1,y);
            dfs(x,y+1);
            dfs(x,y-1);
            dfs(x+1,y+1);
            dfs(x+1,y-1);
            dfs(x-1,y+1);
            dfs(x-1,y-1);
        }
    }
}
