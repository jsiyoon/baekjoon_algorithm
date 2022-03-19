package InputOutput;

import java.io.*;
public class J_10991 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String star = "*";
		String space = "";
		
		for(int i = 0; i < num; i++) {
			star += " *";
			space += " ";
		}
		
		for(int j = 1; j <= num; j++) {
			bw.write(space.substring(0,num-j) + star.substring(0,2*j));
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	/*public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = i; j < num-1; j++) {
				System.out.print(" ");
			}
			for(int z = 0; z <= i; z++) {
				System.out.print("*");
				if(z != i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}*/
}
