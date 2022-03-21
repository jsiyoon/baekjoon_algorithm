package DynamicProgramming;

import java.io.*;
public class J_2193 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		long dp[] = new long[num+2];
		
		//초기값 설정
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i=3; i <= num; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		bw.write(String.valueOf(dp[num]));
		bw.flush();
		bw.close();
		br.close();
	}
}
