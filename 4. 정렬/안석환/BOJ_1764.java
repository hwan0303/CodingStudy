import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;
        int cnt = 0;
        ArrayList<String> answer_arr = new ArrayList<>();
        Map<String, Integer> arr = new HashMap<>();
        for(int i = 0; i < N; i++){
            arr.put(br.readLine(), cnt++);
        }
        for(int i = 0; i < M; i++){
            String check = br.readLine();
            if(arr.keySet().contains(check)){
                answer++;
                answer_arr.add(check);
            }
        }
        Collections.sort(answer_arr);
        System.out.println(answer);
        for(int i = 0; i < answer_arr.size(); i++){
            System.out.println(answer_arr.get(i));
        }
    }
}