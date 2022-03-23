package Sorting;

import java.io.*;
import java.util.*;
public class J_11004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int[] arr = new int[2];
		st = new StringTokenizer(br.readLine(), " ");
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		
		int[] arr2 = new int[arr[0]];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < arr[0]; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr2);
		
		bw.write(String.valueOf(arr2[arr[1]-1]));
		bw.flush();
		bw.close();
		br.close();
	}
}
