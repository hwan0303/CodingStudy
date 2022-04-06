import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            int cnt = 1;
            int[][] arr = new int[N][2];
            for(int j = 0; j < N; j++){
                st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[0] == o2[0]){
                        return o1[1] - o2[1];
                    }else{
                        return o1[0] - o2[0];
                    }
                }
            });
            int min = arr[0][1];
            for(int j = 1; j < N; j++){
                if(min > arr[j][1]){
                    cnt++;
                    min = arr[j][1];
                }
            }
            answer.add(cnt);
        }
        for(int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }
}
