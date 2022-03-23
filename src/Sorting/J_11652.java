package Sorting;

import java.io.*;
import java.util.*;
public class J_11652 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		long[] arr = new long[count];
		
		for(int i = 0; i < count; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(arr);
		
		int cnt = 1, max = 0, num = 0;
		for(int i = 1; i < count; i++) {
			if(arr[i-1] == arr[i]) cnt++;
			else {
				cnt = 1;
			}
			if(cnt > max) {
				max = cnt;
				num = i;
			}
		}
		
		bw.write(String.valueOf(arr[num]));
		bw.flush();
		bw.close();
		br.close();
	}
}
