package DynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;
public class J_9465 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine()); //입력받을 횟수 입력
		
		for(int i = 0; i < count; i++) {
			int num = Integer.parseInt(br.readLine()); //2행 num열 스티커 생성
			int[][] arr = new int[2][num+1]; //2*num배열 생성 - 입력된 값 저장용
			int[][] dp = new int[2][num+1]; //최대값을 구하기 위해, 최대값 경로의 합을 저장하는 배열
			
			
			//arr배열에 값 넣기
			for(int z = 0; z < 2; z++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 1; j <= num; j++) {
					arr[z][j] = Integer.parseInt(st.nextToken());
				}
			}

			for(int z = 0; z <= num ; z++) {
				if(z == 0 || z == 1) { //초기값 지정
					dp[z][1] = arr[z][1];
				}else {
					dp[0][z] = Math.max(dp[1][z-2], dp[1][z-1]) + arr[0][z];
					dp[1][z] = Math.max(dp[0][z-2], dp[0][z-1]) + arr[1][z];					
				}
			}
			bw.write(String.valueOf(Math.max(dp[0][num], dp[1][num])) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
