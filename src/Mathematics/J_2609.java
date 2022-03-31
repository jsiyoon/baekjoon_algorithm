package Mathematics;

import java.io.*;
import java.util.*;
public class J_2609 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int num = 0;//b가 a보다 클때 a <-> b 위한 값 임시저장공간이자, 최대공약수 값 담을 공간
		
		if(b > a) {
			num = a;
			a = b;
			b = num;
		}
		
		for(int i = b; i > 0; i--) {
			if((a % i == 0) && (b % i == 0)) {
				num = i;
				break;
			}
		}
		
		int num2 = num *(a/num) *(b/num); //최소공배수
		
		bw.write(String.valueOf(num + "\n" + num2));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
