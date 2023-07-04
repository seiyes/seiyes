package cospro;

import java.util.ArrayList;

public class Test {

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
		
		
		int[] 돌의내구도= {5,3,4,1,3,8,3};
		//int[] 돌의내구도= {1,2,1,4};
		독[] 독배열 = {
				new 독("루비독","95년생",3,4), //점프력, 몸무게
				new 독("피치독","95년생",3,3),
				new 독("씨-독","72년생",2,1),
				new 독("코볼독","59년생",1,1),
				
				
		};
		solutione(돌의내구도,독배열);
		
	}

	private static void solutione(int[] 돌의내구도, 독[] 독배열) {
		ArrayList<String> answer = new ArrayList<String>();
		
		for (int i = 0; i < 독배열.length; i++) {
			
			boolean isoK = true; //마지막까지 성공..
			
			int j=0;
			while(j < 돌의내구도.length) {
				j = j+독배열[i].점프력;
				
				if(돌의내구도.length<j) break;
				
				
				돌의내구도[j-1] = 돌의내구도[j-1] - 독배열[i].몸무게; 
				
				if(돌의내구도[j-1]<0) {
					isoK = false;
					break;
				}
				
			}
			
			if(isoK==true) {
				answer.add(독배열[i].이름);
			}
			
			
		}
		System.out.println(answer);
		
		
		
	}

}
class 독 {
	String 이름 ;
	String 나이 ;
	int 점프력;
	int 몸무게;
	
	public 독(String 이름, String 나이, int 점프력, int 몸무게) {
		this.나이=나이;
		this.몸무게=몸무게;
		this.이름=이름;
		this.점프력=점프력;
	}
}
