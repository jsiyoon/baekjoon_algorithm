package InputOutput;

import java.util.*;
public class J_2446 {
	static void printstars(int a, int b) {
		for(int j = 1; j < a ; j++) {
			System.out.print(" ");
		}
		for(int z = 1; z < b; z++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		
		for(int i = 0; i < num; i++) printstars(i+1, 2*(num-i));
		for(int i = 1; i < num; i++) printstars(num-i, (i*2)+2);
	}
}
