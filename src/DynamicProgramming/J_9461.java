package DynamicProgramming;

import java.io.*;
public class J_9461 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
	
		long[] dp = new long[101];
		
		//초기값 설정
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i = 0; i < count; i++) {
			int num2 = Integer.parseInt(br.readLine());
			
			for(int j = 3; j <= num2; j++) {
				dp[j] = dp[j-2] + dp[j-3];
			}
			bw.write(String.valueOf(dp[num2] + "\n"));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
