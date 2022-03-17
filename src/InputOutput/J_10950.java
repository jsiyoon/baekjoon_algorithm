package InputOutput;

import java.util.*;

public class J_10950 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			arr[i] = A+B;
		}
		
		/*for(int j = 0; j < num; j++) {
			System.out.println(arr[j]);
		}*/
		for(int sum : arr) {
			System.out.println(sum);
		}
		
		
		/*두번째 방법*/
		/*Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    int a, b;
	    for(int i = 0 ; i < t ; i++) {
	    	a = sc.nextInt();
	        b = sc.nextInt();
	        System.out.println(a+b);
	    }*/
	}
}
