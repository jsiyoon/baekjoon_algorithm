package Mathematics;

import java.util.*;
import java.io.*;
public class J_2745 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n.length(); i++) {//스택에 n순서대로 저장
			stack.push(n.charAt(i));
		}
		
		int num = 0;
		for(int i = 0 ; i < n.length(); i++) {
			int c = stack.pop();
			
			if(c >= 65) c -= 55; //(char)A-Z아스키 코드일때 원래 수로 변환.
			else c -= 48; //0-9의 아스키코드일때 원래 수로 변환
			
			for(int j = 0; j < i; j++) {
				c *= b;
			}
			num += c;
		}
		
		bw.write(String.valueOf(num));
		bw.flush();
		bw.close();
		br.close();
	}
}
