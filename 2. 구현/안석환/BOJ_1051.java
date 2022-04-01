import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                map[i][j] = str.charAt(j)-'0';
            }
        }
        int answer = 1;
        int min = N;
        if(N >= M){
            min = M;
        }
        else{
            min = N;
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
              int check = map[i][j];
              for(int k = 0; k <= min; k++){
                  if(i+k >= N || j+k >= M){
                      break;
                  }
                  else{
                      if(map[i+k][j] == check && map[i][j+k] == check && map[i+k][j+k] == check){
                          answer = Math.max(answer, (k+1) * (k+1));
                      }
                  }
              }
            }
        }
        System.out.println(answer);
    }
}