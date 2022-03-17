package InputOutput;

import java.util.*;

public class J_2439 {
	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		for(int i = 0; i < num; i++) {
			for(int z = 1; z < num - i; z++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
