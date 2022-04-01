package Mathematics;

import java.io.*;
import java.util.*;
public class J_1978 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) stack.push(Integer.parseInt(st.nextToken()));
		
		int result = 0; //소수개수 담을 공간
		for(int i = 0; i < n; i++) {
			int num = stack.pop();
			int ck = 0;
			for(int j = 2; j < num; j++) {
				if(num % j == 0) {
					ck++;
					break;
				}
			}
			if(num != 0 && num != 1 && ck == 0) result++;
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}
