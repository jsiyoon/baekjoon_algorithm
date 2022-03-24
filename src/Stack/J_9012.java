package Stack;

import java.io.*;
import java.util.*;
public class J_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < count; i++) {
			String str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if(c == '(') {
					stack.push(c); 
				}else {
					if(stack.isEmpty()) {
						stack.push(c); //값을 넣어주지 않으면 하단의 조건문에서 yes값이 나올수 있으므로 무조건 명시
						break;// no출력후 for문 빠져나옴. -> 다음 str검사
					}
					else stack.pop();
				}
			}
			if(stack.isEmpty()) bw.write("YES\n");
			else bw.write("NO\n");
			stack.clear(); //저장되어있는 stack공간 초기화.
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
