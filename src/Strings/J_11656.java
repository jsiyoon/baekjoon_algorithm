package Strings;

import java.util.*;
import java.io.*;
public class J_11656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < str.length(); i++) {
			list.add(str.substring(i));
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			bw.write(list.get(i) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
