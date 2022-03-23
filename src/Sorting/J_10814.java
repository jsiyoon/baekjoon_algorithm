package Sorting;

import java.io.*;
import java.util.*;
//ArrayList사용 풀이방법
class Member implements Comparable<Member>{
	int age;
	String name;
	
	Member(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public int compareTo(Member m) {
		// TODO Auto-generated method stub
		if(this .age > m.age) return 1; //나이 오름차순
		else if(this .age < m.age) return -1;
		else return 0;
	}
	
}
public class J_10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		ArrayList<Member> list = new ArrayList<>();
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine() + " ");
			list.add(new Member(Integer.parseInt(st.nextToken()), st.nextToken()));
		}
		Collections.sort(list); //list정렬
		
		for(int i = 0; i < count; i++) {
			bw.write(list.get(i).age + " " + list.get(i).name + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	//배열 사용 풀이방법
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		String[][] arr = new String[count][2];
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine() + " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, (o1, o2) ->{
			return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
		});
		
		for(int i = 0; i < count; i++) {
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}*/
}
