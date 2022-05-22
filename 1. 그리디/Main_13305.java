import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13305 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int ea = Integer.parseInt(br.readLine());
        long[] dist = new long[ea-1];
        long[] price = new long[ea];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<ea-1;i++){
            dist[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<ea;i++){
            price[i] = Integer.parseInt(st.nextToken());
        }

        long sum = price[0]*dist[0];

        long min = price[0];

        for(int i=1;i<ea-1;i++){
            if(min>price[i]) min = price[i];
            sum = sum+ min*dist[i];
        }
        System.out.println(sum);
    }
}
