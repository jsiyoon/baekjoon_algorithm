package Mathematics;

import java.util.*;
import java.io.*;
public class J_1934 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int num = 0; //최대공약수 담을 공간이자, a와 b크기 비교하여 값 바꾸기 위한 임시저장공간.
			if(b > a) {
				num = a;
				a = b;
				b = num;
			}
			
			for(int j = b; j > 0; j--) {
				if((a % j == 0) && (b%j == 0)) {
					num = j;
					break;
				}
			}
			
			bw.write(String.valueOf(num * (a/num) * (b/num)) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
