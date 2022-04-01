package Mathematics;

import java.io.*;
public class J_10872 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n == 0) bw.write(String.valueOf(1));
		else {
			int num = 1;
			for(int i = 1; i <= n; i++) num *= i;
			
			bw.write(String.valueOf(num));			
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
