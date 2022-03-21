package DynamicProgramming;

import java.io.*;
public class J_10844 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long mod = 1000000000;
		int num = Integer.parseInt(br.readLine());
		
		//int형 범위 넘을 수 있기 때문에 long형 사용해야함.
		long dp[][] = new long[num+1][10];
		
		//초기값 설정
		dp[1][0] = 0;
		for(int i = 1; i <= 9; i++) {
			dp[1][i] = 1;
		}
		
		for(int j = 2; j <= num; j ++) {
			dp[j][0] = dp[j-1][1]; //0으로 끝나는 수 개수
			for(int i = 1; i <= 8; i++ ) { //1~8로 끝나는 수 개수
				dp[j][i] = (dp[j-1][i-1] + dp[j-1][i+1]) % mod;
				}
			dp[j][9] = dp[j-1][8] % mod; //9로 끝나는 수 개수
		}
		
		//결과값
		long result = 0;
		for(int i = 0; i <= 9; i++) { //num의 0~9로 끝나는 모든 수의 합
			result += dp[num][i] % mod;
		}
		bw.write(String.valueOf(result % mod));
		bw.flush();
		bw.close();
		br.close();
	}
}
