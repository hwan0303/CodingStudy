import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_1051 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); // 열
        ArrayList<Integer> cnt =new ArrayList<>();
        String arr[]= new String[N];

        for(int i=0;i<N;i++){
            arr[i]= br.readLine();
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                for(int k=j+1;k<M;k++){
                    if(arr[i].charAt(j)==arr[i].charAt(k) && i+k-j<N && arr[i+k-j].charAt(j)==arr[i+k-j].charAt(k) && arr[i].charAt(j)==arr[i+k-j].charAt(j)){
                        cnt.add(k-j+1);
                    }
                }
            }
        }
        Collections.sort(cnt);
        if(!cnt.isEmpty()) System.out.println(cnt.get(cnt.size()-1)*cnt.get(cnt.size()-1));
        else System.out.println(1);
    }
}