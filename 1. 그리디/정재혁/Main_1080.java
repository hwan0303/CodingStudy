import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1080 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int arr1[][] = new int[row][col];
        int arr2[][] = new int[row][col];

        for(int i=0;i<row;i++){
            String str = br.readLine();
            for (int j =0;j<col;j++){
                arr1[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }
        for(int i=0;i<row;i++){
            String str = br.readLine();
            for (int j =0;j<col;j++){
                arr2[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        int cnt =0;
        for(int i=0;i<row-2;i++){
            for (int j =0;j<col-2;j++){
                if(arr1[i][j]!=arr2[i][j]) {
                    for(int k=i;k<i+3;k++){
                        for(int l=j;l<j+3;l++){
                            if(arr1[k][l]==0) arr1[k][l]=1;
                            else arr1[k][l] =0;
                        }
                    }
                    cnt++;
                }
            }
        }
        int cnt1 =0;
        for(int i=0;i<row;i++){
            for (int j =0;j<col;j++){
                if(arr1[i][j]!=arr2[i][j]) cnt1++;
            }
        }
        if(cnt1==0){
            System.out.println(cnt);
        }
        else System.out.println(-1);

    }
}
