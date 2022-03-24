package Sorting;

import java.io.*;
import java.util.*;
public class J_10989 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		
		for(int i = 0; i < count; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		for(int i = 0; i < count; i++) {
			bw.write(String.valueOf(arr[i]) + "\n");
		}
		
		//ArrayList - 메모리 초과 오류 발생.
		/*ArrayList<Long> list = new ArrayList<>();
		
		for(int i = 0; i < count; i++) {
			list.add(Long.parseLong(br.readLine()));
		}
		
		Collections.sort(list);
		for(long l : list) {
			bw.write(String.valueOf(l) + "\n");
		}*/
		
		bw.flush();
		bw.close();
		br.close();
	}
}
