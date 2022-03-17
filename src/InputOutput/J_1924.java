package InputOutput;

import java.util.*;
public class J_1924 {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        
	        int month = sc.nextInt();
	        int day = sc.nextInt();
	        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        String week[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	        
	        for(int i = 0; i < month-1; i++){
	            day += days[i];
	        }
	            System.out.println(week[day%7]);
	    }
}
