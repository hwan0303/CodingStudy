import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11060 {
    public  static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] =-1;
        }
        dp[0]=0;
        for(int i=0;i<N;i++){
            if(dp[i]==-1) continue;
            for(int j=1;j<=arr[i];j++){
                if(i+j<N){
                    if(dp[i+j]==-1 || dp[i+j]>dp[i]+1){
                        dp[i+j] =dp[i]+1;
                    }
                }
            }
        }
        System.out.println(dp[N-1]);

        /*int cnt =0;
        int i=0;
        while(i<N-1){
            int max =0;
            for(int j=1;j<arr[i]+1;j++){
                if(i+j<N && max < j+arr[i+j] && arr[i+j]!=0) max = j;
                if( i+j == N) break;
            }
            i = i+max;
            cnt ++;
            if( i == N) break;

        }
        System.out.println(cnt);*/ //여기까지가 내가 푼 풀이 맞데틀..
    }
}