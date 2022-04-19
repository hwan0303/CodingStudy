import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1764 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();  //set.contain()을 쓰기 위함.
        ArrayList<String> NAll =new ArrayList<>(); //그리고 여기다 추가.

        for(int i=0;i<N;i++){
            set.add(br.readLine());
        }
        for(int i=0;i<M;i++){
            String str = br.readLine();
            if(set.contains(str)) NAll.add(str);
        }
        Collections.sort(NAll);
        sb.append(NAll.size()).append("\n");
        for(int i=0;i<NAll.size();i++){
            sb.append(NAll.get(i)).append("\n");
        }
        System.out.println(sb);



        /*for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(Nli[i].equals(Nse[j])) NAll.add(Nli[i]);
            }
        }

        Collections.sort(NAll);
        System.out.println(NAll.size());
        for(int i=0;i<NAll.size();i++){
            System.out.println(NAll.get(i));
        }*/

    }
}
