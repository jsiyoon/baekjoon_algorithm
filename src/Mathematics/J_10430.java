package Mathematics;

import java.io.*;
import java.util.*;
public class J_10430 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		bw.write(String.valueOf((a+b)%c) + "\n");
		bw.write(String.valueOf(((a%c) + (b%c))%c) + "\n");
		bw.write(String.valueOf((a*b)%c) + "\n");
		bw.write(String.valueOf(((a%c)*(b%c))%c) + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
