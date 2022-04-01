package Mathematics;

import java.util.*;
import java.io.*;
public class J_1929 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i = n; i >= m; i--) stack.push(i);
		
		while(!stack.isEmpty()) {
			int num = stack.pop();
			int ck = 0;
			for(int i = 2; i <= Math.sqrt(num) ; i++) {
				if(num % i == 0) {
					ck++;
					break;
				}
			}
				
			if(num > 1  && ck == 0) bw.write(String.valueOf(num) + "\n");	
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
