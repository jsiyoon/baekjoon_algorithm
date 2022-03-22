package Sorting;

import java.io.*;
import java.util.*;
public class J_2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine()); //입력받을 횟수 입력
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < count; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		for(int l : list) {
			bw.write(String.valueOf(l) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	//배열 사용
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine()); //입력받을 횟수 입력
		int[] arr = new int[count]; //값 저장할 배열 생성
		
		for(int i = 0; i < count; i++) {
			int num = Integer.parseInt(br.readLine()); //값 입력
			arr[i] = num;
		}
		
		Arrays.sort(arr);
		for(int arrs : arr) {
			bw.write(String.valueOf(arrs) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}*/
}
