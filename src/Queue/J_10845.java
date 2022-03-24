package Queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class J_10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<>();
		int num = 0; //queue에 마지막으로 담은 값 저장해 놓기 위함.
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			switch (str) {
			case "push":
				num = Integer.parseInt(st.nextToken());
				que.add(num);
				break;
			case "pop":
				if(que.isEmpty()) bw.write("-1\n");
				else bw.write(que.poll() + "\n");
				break;
			case "size":
				bw.write(que.size() + "\n");
				break;
			case "empty":
				if(que.isEmpty()) bw.write("1\n");
				else bw.write("0\n");
				break;
			case "front":
				if(que.isEmpty()) bw.write("-1\n");
				else bw.write(que.peek() + "\n");
				break;
			case "back":
				if(que.isEmpty()) bw.write("-1\n");
				else bw.write(num + "\n");
				break;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
