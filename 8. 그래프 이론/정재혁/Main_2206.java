import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_2606 {
    static int n;
    static int[] parents;
    static boolean[] check;
    static ArrayList<Integer>[] lst;
    static int cnt;
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int ea = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());

        cnt=0;
        lst = new ArrayList[ea+1];
        check = new boolean[ea+1];

        for (int i=1;i<=ea;i++){ //때용 배열안에 배열넣는게 가능하다니...
            lst[i] = new ArrayList<Integer>();
        }
        for (int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            lst[a].add(b);
            lst[b].add(a);
        }

        dfs(1);


        for (boolean b : check) {
            if(b==true) cnt++;
        }
        System.out.println(cnt-1);
    }

    private static void dfs(int v){
        if(check[v]){
            return;
        }
        check[v]=true;
        for (int i:lst[v]){
            if(!check[i]){
                dfs(i);
            }
        }
    }
}
