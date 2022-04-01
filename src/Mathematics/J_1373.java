package Mathematics;

import java.util.*;
import java.io.*;
public class J_1373 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		if(str.length() % 3 == 2) str = "0" + str;
		else if(str.length() % 3 == 1) str = "00" + str;
		
		Stack<Integer> stack = new Stack<>();
		for(int i = str.length()-1; i >= 0; i--) stack.push((int)(str.charAt(i)-48));
		
		for(int i = 0; i < str.length()-2 ; i+=3) {
			int num = stack.pop() * 4;
			num += stack.pop()*2;
			num += stack.pop();
			bw.write(String.valueOf(num));
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	//2진수 -> 10진수 -> 8진수 (시간초과 오류발생)
	/*public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		Stack<Integer> stack = new Stack<>(); //2진수 수 담는 공간
		for(int i = 0; i < str.length(); i++) stack.push((int)(str.charAt(i)-48));
		
		int num = 0; //2진수 10진수로 변환한 값 저장소
		for(int i = 0; i < str.length(); i++) {
			int st = stack.pop();
			for(int j = 0; j < i; j++)  st *= 2;
			num += st;
		}
		
		while(num > 0) { //2진수 8진수로 변환
			stack.push(num%8);
			num /= 8;
		}
		
		while(!stack.isEmpty()) {
			bw.write(String.valueOf(stack.pop()));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}*/
}
