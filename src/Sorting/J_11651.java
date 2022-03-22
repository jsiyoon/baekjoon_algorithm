package Sorting;

import java.io.*;
import java.util.*;
public class J_11651 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine()); //입력받을 개수 입력
		int[][] arr = new int[count][2];
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (o1, o2)->{
			if(o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}else {
				return o1[1] - o2[1];
			}
		});
		/*Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}else {
					return o1[1] - o2[1];
				}
			}
		});*/
		
		for(int i = 0; i < count; i++) {
			bw.write(String.valueOf(arr[i][0] + " " + arr[i][1]) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
