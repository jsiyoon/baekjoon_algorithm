package Strings;

import java.io.*;
public class J_10820 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = ""; //문자열 저장소 생성
		
		while((str = br.readLine()) != null) {
			int lower = 0, upper = 0, num = 0, space = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') lower++;
				else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') upper++;
				else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') num++;
				else space++;
			}
			bw.write(String.valueOf(lower + " " + upper + " " + num + " " + space) + "\n");
			bw.flush();
		}
		bw.close();
		br.close();
	}
}
