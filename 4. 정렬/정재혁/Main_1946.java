import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1946 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for(int i=0;i<testcase;i++){
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][2];
            int count =1;//서류 1등은 무조건 뽑힘.
            StringTokenizer st;
            for(int j=0;j<N;j++){
                st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, (o1, o2) -> {
                if(o1[0] == o2[0]) {
                    return Integer.compare(o1[1], o2[1]);
                }
                else{
                    return Integer.compare(o1[0],o2[0]);
                }
            });
            int min = arr[0][1];
            for(int j=1;j<N;j++){
                if(min>arr[j][1]){
                    min = arr[j][1];
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
