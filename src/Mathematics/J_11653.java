package Mathematics;

import java.io.*;
public class J_11653 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n != 1) {//n이 1일 경우 아무것도 출력하지 않음.
			if(n < 2) bw.write(String.valueOf(n));
			while(n > 1) {
				for(int i = 2; i <= n; i++) {
					if(n % i == 0) {
						bw.write(String.valueOf(i) + "\n");
						n /= i;
						break;
					}
				}
			}
			bw.flush();
			bw.close();
			br.close();
		}
	}
}
