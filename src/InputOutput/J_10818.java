package InputOutput;

import java.util.*;
public class J_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int Max = -1000000;
		int Min = 1000000;
		/*int nums[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			nums[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		System.out.print(nums[0] + " " + nums[num-1]);*/
		
		for(int i = 0; i < num; i++) {
			int number = sc.nextInt();
			Max = Math.max(Max, number);
			Min = Math.min(Min, number);
		}
		
		System.out.println(Min + " " + Max);
	}
}

