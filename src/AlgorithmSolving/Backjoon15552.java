package AlgorithmSolving;

import java.io.*;

import java.util.StringTokenizer;

public class Backjoon15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb  = new StringBuilder();
        int m = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer st ;

        for(int i=0; i<m; i++){
            String str = bufferedReader.readLine();  //1 1
            int num = str.indexOf(" ");
            int result = Integer.parseInt(str.substring(0,num))+Integer.parseInt(str.substring(num+1));
            sb.append(result+"\n");
        }
        bufferedReader.close();
        System.out.print(sb);
//        for (int i = 0; i < m; i++) {
//            st = new StringTokenizer(bufferedReader.readLine()," ");
//            bufferedWriter.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
//
//        }
//        bufferedReader.close();
//
//        bufferedWriter.flush();
//        bufferedWriter.close();
    }

}
