package DynamicProgramming;

import java.io.*;
public class J_11057 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long mod = 10007;
		int num = Integer.parseInt(br.readLine());
		long[][] dp = new long[num+1][10];
		
		for(int i = 0 ; i < 10; i++) {
			dp[1][i] = 1;
		}
		
		for(int i = 2; i <= num; i++) {
			for(int z = 0; z < 10; z++) {
				for(int j = z; j < 10; j++) {
					dp[i][z] += dp[i-1][j] % mod;
				}
			}
		}
		
		long result = 0;
		for(int i = 0; i < 10; i++) {
			result += dp[num][i] % mod;
		}
		bw.write(String.valueOf(result % mod));
		bw.flush();
		bw.close();
		br.close();
	}
}
