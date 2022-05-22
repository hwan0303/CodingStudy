import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_11725 {
    static int n;
    static ArrayList<Integer>[] list;
    static int[] parents;
    static boolean[] check;

    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());

        list = new ArrayList[n+1];
        parents = new int[n+1];
        check = new boolean[n+1];

        for (int i=1;i<=n;i++){ //때용 배열안에 배열넣는게 가능하다니...
            list[i] = new ArrayList<Integer>();
        }

        for (int i=1;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }
        for (int i=1;i<=n;i++){
            if(!check[i]){
                dfs(i);
            }
        }
        for(int i=2;i<=n;i++){
            System.out.println(parents[i]);
        }
    }
    private static void dfs(int v){
        if(check[v]){
            return;
        }
        check[v]=true;
        for (int i:list[v]){
            if(!check[i]){
                parents[i] =v;
                dfs(i);
            }
        }
    }
}
