package DynamicProgramming;

import java.io.*;
public class J_9095 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		int[] dp = new int[11];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int j = 0; j < count; j++) {
			int num = Integer.parseInt(br.readLine());
			for(int i = 4; i <= num; i++) {
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
			}
			System.out.println(dp[num]);
		}
		br.close();
	}
}
