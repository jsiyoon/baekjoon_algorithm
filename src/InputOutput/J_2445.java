package InputOutput;

import java.util.*;
public class J_2445 {
	static void printstars(int a, int b){
		for(int j = 1; j <= a; j++) {
			System.out.print("*");
		}
		for(int z = 0; z < b; z++) {
			System.out.print(" ");
		}
		for(int k = 1; k <= a; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		for(int i = 1; i <= num; i++) printstars(i, 2*(num-i)); //윗줄
		for(int i = 1; i <= num-1; i++) printstars(num-i, 2*i); //아래줄
	}
	/*public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		//윗줄
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(int z = 0; z < 2*(num-i); z++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//아래줄
		for(int i = 1; i <= num-1; i++) {
			for(int j = 1; j <= num-i; j++) {
				System.out.print("*");
			}
			for(int z = 0; z < 2*i; z++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= num-i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}*/
}
