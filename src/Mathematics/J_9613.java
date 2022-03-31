package Mathematics;

import java.io.*;
import java.util.*;
public class J_9613 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int count2 = Integer.parseInt(st.nextToken());
			long sum = 0; //주어지는 수는 1,000,000임으로  최대공약수(GCD) 합이 int형을 넘어설수 있다.
			
			int[] arr = new int[count2];
			for(int j = 0 ; j < count2; j++ ) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int k = 0; k < count2 - 1; k++) {
				for(int z = k+1; z < count2; z++) {
					sum += gcd(arr[k], arr[z]);
				}
			}
			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	private static int gcd(int a, int b) {//최대공약수 구하는 함수
		return b == 0 ? a : gcd(b, a%b);
	}
}
