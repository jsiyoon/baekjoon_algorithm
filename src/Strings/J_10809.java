package Strings;

import java.io.*;
import java.util.Arrays;
public class J_10809 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int[] arr = new int[26];
		
		Arrays.fill(arr, -1);
		/*for(int i = 0; i < 26; i++) {
			arr[i] = -1;
		}*/
		
		for(int i = 0 ; i < str.length(); i++) {
			if(arr[(int)str.charAt(i)-97] == -1) {
				arr[(int)str.charAt(i)-97] = i;
			}
		}
		
		for(int a : arr) {
			bw.write(String.valueOf(a) + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
