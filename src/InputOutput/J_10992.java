package InputOutput;

import java.util.*;
import java.io.*;
public class J_10992 {
	static void printStars(int a) {
		for(int j = 0; j < a; j++) {
			System.out.print(j != a-1 ? " " : "*");
		}
	}
	public static void main(String[] args) throws IOException{
		//int num = new Scanner(System.in).nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i < num-1; i++){
			printStars(num-i);
			printStars(2*i);
			System.out.println();
		}
		
		for(int i = 0; i < 2*num-1; i++) {
			System.out.print("*");
		}
	}
}
