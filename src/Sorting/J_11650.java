package Sorting;

import java.io.*;
import java.util.*;
public class J_11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());//입력받을 횟수 
		int[][] arr = new int[count][2];
		
		for(int i = 0 ; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (a1, a2) ->{
			if(a1[0] == a2[0]) {
				return Integer.compare(a1[1], a2[1]);
			}else {
				return Integer.compare(a1[0], a2[0]);
			}
		} );
		
		for(int i = 0; i < count; i++) {
			bw.write(String.valueOf(arr[i][0] + " " + arr[i][1]) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
