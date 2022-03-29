package Strings;

import java.io.*;
public class J_10808 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int[] arr = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			arr[(int)str.charAt(i) - 97]++;
		}
		
		for(int a : arr) {
			bw.write(String.valueOf(a) + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		char[] arr = new char[26];
		int[] arr2 = new int[26];
		
		for(int i = 0; i < 26; i++) {
			arr[i] = (char)(97+i); //아스키 코드 사용해 a~z까지 저장.
		}
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < 26; j++) {
				if(arr[j] == str.charAt(i)) { //저장된 값과 입력된값 비교
					arr2[j]++;
					break;
				}
			}
		}
		
		for(int a : arr2) {
			bw.write(String.valueOf(a) + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}*/
}
