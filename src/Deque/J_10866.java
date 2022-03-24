package Deque;

import java.util.*;
import java.io.*;
public class J_10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		Deque<Integer> deq = new ArrayDeque<>();
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			switch (str) {
			case "push_front":
				deq.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				deq.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if(deq.isEmpty()) bw.write("-1\n");
				else bw.write(deq.remove() + "\n");
				break;
			case "pop_back":
				if(deq.isEmpty()) bw.write("-1\n");
				else bw.write(deq.removeLast() + "\n");
				break;
			case "size":
				bw.write(deq.size() + "\n");
				break;
			case "empty":
				if(deq.isEmpty()) bw.write("1\n");
				else bw.write("0\n");
				break;
			case "front":
				if(deq.isEmpty()) bw.write("-1\n");
				else bw.write(deq.peek() + "\n");
				break;
			case "back":
				if(deq.isEmpty()) bw.write("-1\n");
				else bw.write(deq.peekLast() + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}