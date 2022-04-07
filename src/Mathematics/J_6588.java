package Mathematics;

import java.io.*;
import java.util.Arrays;
public class J_6588 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//소수판별(에라토스테네스의 체)
		int max = 1000000;
		Boolean arr[] = new Boolean[max+1];
		Arrays.fill(arr, true);
		for(int i = 2; i <= max; i++) {
			for(int j = i*2; j <= max; j+=i) { //소수가 아닌것은 false처리
				if(!arr[j]) continue;
				arr[j] = false;
			}
		}
		
		while(true) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) break;
			
			boolean b = false;
			for(int i = 2; i <= max/2; i++) {
				if(arr[i] && arr[num-i]) {
					bw.write(String.valueOf(num + " = " + i + " + " + (num-i)) + "\n");
					b = true;
					break;
				}
			}
			if(b == false) bw.write("Goldbach's conjecture is wrong.\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	/*public static void main(String[] args) throws Exception{
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 1000000;
		boolean[] arr = new boolean[max + 1];
		Arrays.fill(arr, true); //모든 배열 true로
		
		arr[0] = false; //소수가 아님
		arr[1] = false; //소수가 아님
		for(int i = 2; i <= max; i++) { //1~1000000까지 소수 인것만 true로 바꿔줌.
			for(int j = i*2; j <= max; j += i) {
				if(!arr[j]) continue;
				arr[j] = false;
			}
		}
		
		while(true) {
			long n = Long.parseLong(br.readLine());
			if(n == 0) break; // 0입력되면 값 출력후 stop
			
			boolean ok = false;
			for(int i = 2; i <= n/2; i++) {
				if(arr[i] && arr[(int)n-i]) {
					ok = true;
					bw.write(String.valueOf(n + " = " + i + " + " + (n-i)) + "\n");
					break;
				}
			}
			
			if(ok == false) bw.write("Goldbach's conjecture is wrong.\n");
			
		}
		bw.flush();
		bw.close();
		br.close();
	}*/

	/*public static void main(String[] args) throws Exception{
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n;
		while(true) {
			n = Integer.parseInt(br.readLine());
			if(n == 0) break; //0입력되면 stop
			
			long a2 = 1, b2 = 1;
			f: for(int i = 3; i <= n/2; i++) {
				for(int j = 2; j <= Math.sqrt(i); j++) { //i가 소수인지 판별
					if(i % j == 0) continue f;
				}
				
				long b = n-i;
				for(int j = 2; j <= Math.sqrt(b); j++) { // b가 소수인지 판별
					if(b % j == 0) continue f;
				}
				
				if(b - i > b2 - a2) { //두 수의 차가 가장 클 경우 출력.
					b2 = b;
					a2 = i;
					bw.write(String.valueOf(n + " = " + i + " + " + b) + "\n");
				}else if(a2 == 1 && b2 == 1) bw.write("Goldbach's conjecture is wrong.\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}*/
}
