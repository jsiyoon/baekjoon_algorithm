package Strings;

import java.io.*;
public class J_2743 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		bw.write(String.valueOf(str.length()));
		bw.flush();
		bw.close();
		br.close();
	}
}
