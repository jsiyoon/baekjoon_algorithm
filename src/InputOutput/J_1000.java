package InputOutput;

import java.util.Arrays;
import java.util.Scanner;

public class J_1000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			arr[i] = A+B;
		}
		
		for(int j = 0; j < num; j++) {
			System.out.println(arr[j]);
		}
	}
}
