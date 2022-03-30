package Linked_Lists;

import java.io.*;
import java.util.*;
public class J_1406 {
	static String str;
	static int count;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> stack = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		
		str = br.readLine();
		count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "L":
				if(!stack.isEmpty()) stack2.push(stack.pop());
				break;
			case "D" :
				if(!stack2.isEmpty()) stack.push(stack2.pop());
				break;
			case "B" :
				if(!stack.isEmpty()) stack.pop();
				break;
			case "P" :
				stack.push(st.nextToken().charAt(0));
				break;
			}
		}
		
		while(!stack.isEmpty()) {
			stack2.push(stack.pop());
		}
		
		while(!stack2.isEmpty()) {
			sb.append(stack2.pop());
		}
		
		bw.write(sb + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
	/*public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int count = Integer.parseInt(br.readLine());
		
		LinkedList<Character> list = new LinkedList<>();
		
		for(int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		
		int index = list.size();
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "L":
				if(index != 0) index--;
				break;
			case "D" :
				if(index != list.size()) index++;
				break;
			case "B" :
				if(index != 0) {
					list.remove(index-1);
					index--;
				}
				break;
			case "P" :
				list.add(index, st.nextToken().charAt(0));
				index++;
				break;
			}
		}
		
		for(char c: list) {
			bw.write(c);
		}
		
		bw.flush();
		bw.close();
		br.close();
	}*/
}
