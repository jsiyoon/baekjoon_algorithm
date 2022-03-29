package Strings;

import java.io.*;
public class J_11655 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//A-Z : 65-90
		//a-z : 97-122
		String str = br.readLine();
		for(int i = 0 ; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				c= (char) (c + 13);
				if(c > 'Z') c= (char)(c - 26);
			}else if(c >= 'a' && c <= 'z') {
				c= (char) (c + 13);
				if(c > 'z') c= (char)(c - 26);
			}
			bw.write(c);
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
