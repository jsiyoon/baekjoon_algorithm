package Stack;

import java.util.*;
import java.io.*;
public class J_10799 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		int result = 0;
		for(int i=0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '(') stack.push(c);
			else {
				stack.pop();
				if(str.charAt(i-1) == '(') result += stack.size();
				else result++;
			}
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}
