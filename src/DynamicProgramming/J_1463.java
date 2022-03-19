package DynamicProgramming;

import java.io.*;
public class J_1463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
	
		int[] dp = new int[num+1];
		dp[0] = dp[1] = 0;
		
		for(int i = 2; i <= num; i++) {
			dp[i] = dp[i-1] + 1;
			
			if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3]+1);
			if(i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2]+1);
		}
		
		//System.out.println(dp[num]);
		bw.write(String.valueOf(dp[num]));
		bw.flush();
		bw.close();
		br.close();
	}
}
