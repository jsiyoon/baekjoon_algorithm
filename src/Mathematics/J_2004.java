package Mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class J_2004 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());
		
		long num2 = n2(n) - (n2(m) + n2(n-m));
		long num5 = n5(n) - (n5(m) + n5(n-m));
		
		bw.write(String.valueOf(Math.min(num2, num5)));
		bw.flush();
		bw.close();
		br.close();
	}
	public static long n2(long a) {
		long n2 = 0;
		if(a < 2) return 0;
		for(long i = 2; i <= a; i*=2) {
			n2 += (a/i);
		}
		return n2;
	}
	public static long n5(long a) {
		long n5 = 0;
		if(a < 2) return 0;
		for(long i = 5; i <= a; i*=5) {
			n5 += (a/i);
		}
		return n5;
	}
}
