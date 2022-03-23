package Sorting;

import java.io.*;
import java.util.*;
class student implements Comparable<student>{

	String name;
	int kor;
	int eng;
	int math;
	
	student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public int compareTo(student s) { //비교
		// TODO Auto-generated method stub
		if(this.kor == s.kor) {
			if(this.eng == s.eng) {
				if(this.math == s.math) return name.compareTo(s.name); //compareTo - 값 1개 비교
				else return Integer.compare(s.math, this.math); //compare - 값 2개 비교, 내림차순
			}else return Integer.compare(this.eng, s.eng); //오름차순
		}else return Integer.compare(s.kor, this.kor); //내림차순
	}
	
}
public class J_10825 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		ArrayList<student> list = new ArrayList<>();
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			list.add(new student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < count; i++) {
			bw.write(list.get(i).name + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
