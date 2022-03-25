package Strings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class J_10824 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		ArrayList<String> num = new ArrayList<>();
		for(int i = 0; i < 4; i++) {
			num.add(st.nextToken());
		}
		
		String sum1 = num.get(0) + num.get(1);
		String sum2 = num.get(2) + num.get(3);
		
		long result = Integer.parseInt(sum1) + Integer.parseInt(sum2);
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}
