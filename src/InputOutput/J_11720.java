package InputOutput;

import java.util.*;

public class J_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		String arr[] = sc.next().split("");
		
		for(int i = 0; i < num; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
	}
}
