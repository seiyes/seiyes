package cospro;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int y, x;

	//test git 2
	
	Node(int y, int x) {
		this.y = y;
		this.x = x;
	}
}

class Solution2 {
	
	
	public static void main(String[] args) {
		
		Solution2 solution2 = new Solution2();
		
		int[] seeds = {1,2};
		
		
		int height = 5;
		int weight = 5;
		
	int rsult = 	solution2.solution(height, weight, seeds);
	
	
	System.out.println(rsult);
	}
	
	public int solution(int height, int width, int[] seed1) {

		
		int answer = 0;
		
		int[][] arr = new int[height][width];
		
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(new Node(seed1[0],seed1[1]));
		
		int[] directY = {-1,1,0,0};
		int[] directX = {0,0,1,-1};;
		
		while(!q.isEmpty()) {
			
			
			Node n = q.poll();
			
			for (int i = 0; i < 4; i++) {
					int dy = n.y + directY[i];
					int dx = n.x + directX[i];
					
					if(dx<0||dy<0||dy>=height||dx>=width) continue;
					if(arr[dy][dx] !=0) continue;
					
					arr[dy][dx] = arr[n.y][n.x]+1;
					
					answer = arr[dy][dx];
					q.add(new Node(dy,dx));
			}
		}
		
		System.out.println(answer);
		
		
		
		
		
		

		return answer;
	}
}