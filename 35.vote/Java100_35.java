class Solution{		
	public void solutionMethod(int num, int[] voted){
		int[] candidate = new int[num+1];
		
		//count voted
		for(int i=0;i<voted.length;i++){
			candidate[voted[i]]++;
		}
		
		//print voted
		for(int i=1;i<4;i++){
			System.out.println(i+"번 후보 --> "+candidate[i]+" 표");
		}
		
		//win		
		int winer = 0;
		int winerTicket=candidate[0];
		for(int i=1;i<4;i++){
			if(candidate[winer]<candidate[i]){
				winer=i;
				winerTicket=candidate[i];
			}
		}
		
		System.out.println("가장 많은 득표수: "+winerTicket+"표, "+winer+"후보");
		
		//check half
		boolean majority=winerTicket<=(voted.length/(double)2);
		if(majority)System.out.println("과반수 이상 실패 -> 미당선");
		else System.out.println("과반수 통과 -> "+winer+"후보 당선");
	}
}

public class Java100_35{
	public static void main(String[] args){
		Solution s1 = new Solution();

		int[] vote_box = {1,3,1,3,3,2,2};

		s1.solutionMethod(3, vote_box);
	}
}