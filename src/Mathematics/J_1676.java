package Mathematics;

import java.io.*;
public class J_1676 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int n2 = 0;
		int n5 = 0;
		
		//2와 5의 곱 개수 세기
		for(int i = 2; i <= n; i++) {
			int num = i;// 없으면 시간초과 발생
			while(num % 2 == 0) { //소인수 분해하여 2 개수 구하기
				n2++;
				num /= 2;
			}
			while(num % 5 == 0) { //소인수 분해하여 5 개수 구하기
				n5++;
				num /= 5;
			}
		}
		
		bw.write(String.valueOf(Math.min(n2, n5)));
		bw.flush();
		bw.close();
		br.close();
	}
	
	//25이상의 값 입력시 long타입 벗어나므로, 오답 출력됨.
	/*public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int num = 1;
		if(n > 2) {
			for(int i = 2; i <= n; i++) num *= i;
		}else num = n;
		String str = String.valueOf(num);
		
		bw.write(str);
		int result = 0;
		for(int i = str.length()-1; i >= 0; i--) {
			if(str.charAt(i) == '0') {
				result++;
			}else {
				bw.write(String.valueOf(result));
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}*/
}
