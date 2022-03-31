package Mathematics;

import java.io.*;
import java.util.*;
public class J_11005 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		while(a > 0) {			
			stack.push((char)(ck(a, b)));
			
			a /= b;
		}
		
		while(!stack.isEmpty()) bw.write(stack.pop());
		bw.flush();
		bw.close();
		br.close();
	}
	private static long ck(long a, long b) {
		return a%b > 9 ? (a%b + 55) : (a%b + 48);
	}
}
