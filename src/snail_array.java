import java.util.*;

public class snail_array {
	public static void main(String[] args) {
		//2차원 배열 - 달팽이 모양으로 돌면서 배열 채우기
		//N값을 입력받으면 1~N*N까지 달팽이 모양으로 채우기
		
		/*
		ex - N = 3일때		4일때
			배열 1 2 3		1  2  3  4
			   8 9 4		12 13 14 5
			   7 6 5		11 16 15 6
			   				10 9  8  7
		*/
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] arr = new int[N][N]; //결과값 저장소.
		
		int num = 1; //배열에 저장될 값
		int row = 0; //행
		int column = -1; //열
		int control = 1; // 행과 열을 도와주는 수
		int count = N; //한줄마다 입력될 값의 수
		
		for(int i = 0; i < N; i--) {//회전수
			for(int j = 0; j < count; j++) {//가로로 저장(오른쪽으로, 왼쪽으로)
				column += control;
				arr[row][column] = num;
				num++;
			}
			count--;
			for(int k = 0; k < count; k++) {//세로로 저장(아래로, 위로)
				row += control; 
				arr[row][column] = num;
				num++;
			}
			control *= -1; //값을 + 해줄지 - 해줄지를 결정
		}
		
		for(int i = 0; i < N; i++ ) { //결과값 출력
			for(int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + "  ");
				
			}
			System.out.println();
		}
	}
}
