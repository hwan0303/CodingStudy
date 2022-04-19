import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_18870 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] arrclone = new int[N];
        int cnt=0;
        HashMap map = new HashMap<>();
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        arrclone = arr.clone();
        Arrays.sort(arrclone);
        for(int i=0;i<N;i++){
            if(!map.containsKey(arrclone[i])) map.put(arrclone[i],cnt++);
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }
        System.out.println(sb);

        /*int same=0;
        for(int i=0;i<N;i++){
            for(int j =0;j<N;j++){
                if(i!=j && arr[i]>arr[j]){
                    list.add(arr[j]);
                }
                cnt[i]=list.size();
                list.clear();
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i!=j && arr[i]>arr[j]){
                    for(int k=0;k<j;k++){
                        if(arr[j]==arr[k]) same++;
                    }
                    if(same==0) cnt[i]++;
                    same=0;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(cnt[i] +" ");
        }*/
    }
}
