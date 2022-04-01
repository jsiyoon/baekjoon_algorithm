package Mathematics;

import java.util.*;
import java.io.*;
public class J_1212 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String[] arr = {"000", "001", "010", "011", "100", "101", "110", "111"};
		
		String str = br.readLine();
		for(int i = 0; i < str.length(); i++) {
			int num = (int)(str.charAt(i) - '0');
			sb.append(arr[num]);
		}
		
		if(str.equals("0")) bw.write("0");//0이면 0만 출력
		else {
			while(sb.charAt(0) == '0') sb = new StringBuilder(sb.substring(1)); //맨 처음 숫자 0으로 시작하는것 삭제.
			bw.write(sb.toString());
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	//stack사용
	/*public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		
		String str = br.readLine();
		if(str.equals("0")) stack.push(0); // 0일때는 0만 출력.
		for(int i = 0; i < str.length(); i++) {
			int num = (int)(str.charAt(i)-48);
			int sum = num;
			while(sum > 0) {
				stack.push(sum % 2);
				sum /= 2;
			}
			if(i != 0 && num < 4) {
				if(num > 1) stack.push(0);
				else if(num == 1) {
					stack.push(0);
					stack.push(0);
				}else {
					stack.push(0);
					stack.push(0);
					stack.push(0);
				}
			}
			while(!stack.isEmpty()) bw.write(String.valueOf(stack.pop()));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}*/
}
