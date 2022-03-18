package InputOutput;

import java.util.*;
public class J_2442 {
	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		
		for(int i = 0; i < num; i++ ) {
			for(int j = num; j > i+1; j--) {
				System.out.print(" ");
			}
			for(int z = 0; z < i*2+1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
