import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_19941 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int table = Integer.parseInt(st.nextToken());
        int dist = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        char arr[] =new char[str.length()];
        for (int i=0;i<str.length();i++){
            arr[i] = str.charAt(i);
        }
        int cnt =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='P'){
                int j = dist*(-1);
                while(j <= dist){
                    if(i+j<0 || i+j>=arr.length) j++;
                    else{
                        if(arr[i+j]=='H'){
                            cnt++;
                            arr[i+j] ='K';
                            break;
                        }
                    }
                    j++;
                }
            }
        }
        System.out.println(cnt);
    }
}
