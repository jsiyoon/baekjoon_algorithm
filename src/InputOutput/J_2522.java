package InputOutput;

import java.util.*;
public class J_2522 {
	static void printstars(int a, int b) {
		for(int j = 0; j < a; j++) {
			System.out.print(" ");
		}
		for(int z = 0; z < b; z++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		for(int i = 1; i <= num; i++) printstars(num-i, i);
		for(int i = 1; i< num; i++) printstars(i, num-i);
	}
}
