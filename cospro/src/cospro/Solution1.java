package cospro;

import java.util.Iterator;

public class Solution1 {
	
	
	
	
	
	public int solution(String[] aTR) {
		
		
		String answer = "";
		
		int[] DAT=new int[26];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				DAT[aTR[i].toCharArray()[j]-'A']++;
			}
		}
		
		
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < DAT[i]; j++) {
				
				answer += (char)('A'+i);
				
				
			}
		}
		
		System.out.println(answer);
		
		return 0;
		
		
		
	}
	
	
	public static void main(String[] args) {
		String[] ATR= {"ABC","KTD","FLE","WOE","QED"};
		Solution1 sol =new Solution1();
		sol.solution(ATR);
	}
}
