package DynamicProgramming;

import java.io.*;
public class J_2133 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int[] dp = new int[num+1];
		
		dp[0] = 1;
		if(num > 1) dp[2] = 3; // 1이하일때 런타임 에러 발생.
		
		for(int i = 4; i <= num; i+=2) {
			dp[i] = dp[i-2] * dp[2];
			for(int j = i-4; j >= 0 ; j -= 2) {
				dp[i] += (dp[j] * 2);
			}
		}
		
		bw.write(String.valueOf(dp[num]));
		bw.flush();
		bw.close();
		br.close();
	}
}
