package Linked_Lists;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class J_1158 {
	static int num, n;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		num = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1 ; i <= num; i++) list.add(i);
		
		int count = n-1;
		
		while(true) {
			sb.append(list.get(count));
			list.remove(count);
			if(list.size() == 0) break;
			sb.append(", ");
			count += n-1;
			count %= list.size();
		}
		
		bw.write("<" + sb + ">");
		bw.flush();
		bw.close();
		br.close();
	}
}
