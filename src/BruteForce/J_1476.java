package BruteForce;

import java.util.*;
import java.io.*;
public class J_1476 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int count = 1;
		int e = 1, s = 1, m = 1;
		while(true) {
			
			if(e > 15) e = 1;
			if(s > 28) s = 1; 
			if(m > 19) m = 1;
			
			if(E == e && S == s && M == m) break;
			e++;
			s++;
			m++;
			count++;
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
